package ssh;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.SftpProgressMonitor;

/**
 * SSH Utils
 * 
 * @author tfxiaozi
 * 
 */
public class Ssh {
	Logger logger = Logger.getLogger(this.getClass());
	private String host = "";
	private String user = "";
	private int port = 22;
	private String password = "";
	private static final String PROTOCOL = "sftp";
	JSch jsch = new JSch();
	private Session session;
	private Channel channel;
	private ChannelSftp sftp;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Ssh() {
	}

	public Ssh(String host, int port, String user, String password) {
		this.host = host;
		this.user = user;
		this.password = password;
		this.port = port;
	}

	/**
	 * connect ssh
	 * 
	 * @throws JSchException
	 */
	public void connect() throws JSchException {
		if (session == null) {
			JSch jsch = new JSch();
			session = jsch.getSession(user, host, port);
			session.setConfig("StrictHostKeyChecking", "no");
			// java.util.Properties config = new java.util.Properties();
			// config.put("StrictHostKeyChecking", "no");

			session.setPassword(password);
			session.connect();
			channel = session.openChannel(PROTOCOL);
			channel.connect();
			sftp = (ChannelSftp) channel;
		}
	}

	/**
	 * disconnect ssh
	 */
	public void disconnect() {
		if (session != null) {
			session.disconnect();
			session = null;
		}
	}

	/**
	 * upload
	 * 
	 * @param localFileName
	 * @param remoteFileName
	 * @return
	 */
	public boolean upload(String localFileName, String remoteFileName)
			throws Exception {
		boolean bSucc = false;
		try {
			SftpProgressMonitor monitor = new MyProgressMonitor();
			int mode = ChannelSftp.OVERWRITE;
			sftp.put(localFileName, remoteFileName, monitor, mode);
			bSucc = true;
		} catch (Exception e) {
			logger.error(e);
		} finally {
			if (null != channel) {
				channel.disconnect();
			}
		}
		return bSucc;
	}

	/**
	 * delete file
	 * 
	 * @param directory
	 * @param fileName
	 * @return
	 */
	public boolean deteleFile(String directory, String fileName) {
		boolean flag = false;
		try {
			sftp.cd(directory);
			sftp.rm(fileName);
			flag = true;
		} catch (SftpException e) {
			flag = false;
			logger.error(e);
		}
		return flag;
	}

	/**
	 * delete directory
	 * 
	 * @param directory
	 *            dir to be delete
	 * @param sure
	 *            be sure to delete
	 * @return
	 */
	public String deleteDir(String directory, boolean sure) {
		String command = "rm -rf " + directory;
		String result = execCommand(command, true);
		return result;
	}

	/**
	 * compress the files and sub-dir of directory into a zip named compressName
	 * 
	 * @param directory
	 *            the content directory to be compress
	 * @param compressName
	 *            the name in directory after it is compressed
	 * @throws SftpException
	 * @usage ssh.compressDir("/home/tfxiaozi/webapp", "test.zip");
	 */
	public void compressDir(String directory, String compressName)
			throws SftpException {
		String command = "cd " + directory + "\nzip -r " + compressName + " ./"
				+ compressName.substring(0, compressName.lastIndexOf("."));
		execCommand(command, true);
	}

	/**
	 * download
	 * 
	 * @param localFileName
	 * @param remoteFileName
	 * @return
	 */
	public boolean download(String localFileName, String remoteFileName) {
		boolean bSucc = false;
		Channel channel = null;
		try {
			SftpProgressMonitor monitor = new MyProgressMonitor();
			sftp.get(remoteFileName, localFileName, monitor,
					ChannelSftp.OVERWRITE);
			bSucc = true;
		} catch (Exception e) {
			logger.error(e);
		} finally {
			if (null != channel) {
				channel.disconnect();
			}
		}
		return bSucc;
	}

	/**
	 * execute command
	 * 
	 * @param command
	 * @param flag
	 * @return
	 */
	public String execCommand(String command, boolean flag) {
		Channel channel = null;
		InputStream in = null;
		StringBuffer sb = new StringBuffer("");
		try {
			channel = session.openChannel("exec");
			System.out.println("command:" + command);
			((ChannelExec) channel)
					.setCommand("export TERM=ansi && " + command);
			((ChannelExec) channel).setErrStream(System.err);
			in = channel.getInputStream();
			channel.connect();
			if (flag) {
				byte[] tmp = new byte[10240];
				while (true) {
					while (in.available() > 0) {
						int i = in.read(tmp, 0, 10240);
						if (i < 0) {
							break;
						}
						sb.append(new String(tmp, 0, i));
					}
					if (channel.isClosed()) {
						break;
					}
				}
			}
			in.close();
		} catch (Exception e) {
			logger.error(e);
		} finally {
			if (channel != null) {
				channel.disconnect();
			}
		}
		return sb.toString();
	}

	/**
	 * get cpu info
	 * 
	 * @return
	 */
	public String[] getCpuInfo() {
		Channel channel = null;
		InputStream in = null;
		StringBuffer sb = new StringBuffer("");
		try {
			channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand("export TERM=ansi && top -bn 1");// ansi一定要加
			in = channel.getInputStream();
			((ChannelExec) channel).setErrStream(System.err);
			channel.connect();
			byte[] tmp = new byte[10240];
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 10240);
					if (i < 0) {
						break;
					}
					sb.append(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					break;
				}
			}
		} catch (Exception e) {
			logger.error(e);
		} finally {
			if (channel != null) {
				channel.disconnect();
			}
		}
		String buf = sb.toString();
		if (buf.indexOf("Swap") != -1) {
			buf = buf.substring(0, buf.indexOf("Swap"));
		}
		if (buf.indexOf("Cpu") != -1) {
			buf = buf.substring(buf.indexOf("Cpu"), buf.length());
		}
		buf.replaceAll(" ", " ");
		return buf.split("\\n");
	}

	/**
	 * get hard disk info
	 * 
	 * @return
	 */
	public String getHardDiskInfo() throws Exception {
		Channel channel = null;
		InputStream in = null;
		StringBuffer sb = new StringBuffer("");
		try {
			channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand("df -lh");
			in = channel.getInputStream();
			((ChannelExec) channel).setErrStream(System.err);
			channel.connect();

			byte[] tmp = new byte[10240];
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 10240);
					if (i < 0) {
						break;
					}
					sb.append(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					break;
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (channel != null) {
				channel.disconnect();
			}
		}
		String buf = sb.toString();
		String[] info = buf.split("\n");
		if (info.length > 2) {// first line: Filesystem Size Used Avail Use%
								// Mounted on
			String tmp = "";
			for (int i = 1; i < info.length; i++) {
				tmp = info[i];
				String[] tmpArr = tmp.split("%");
				if (tmpArr[1].trim().equals("/")) {
					boolean flag = true;
					while (flag) {
						tmp = tmp.replaceAll(" ", " ");
						if (tmp.indexOf(" ") == -1) {
							flag = false;
						}
					}

					String[] result = tmp.split(" ");
					if (result != null && result.length == 6) {
						buf = result[1] + " total, " + result[2] + " used, "
								+ result[3] + " free";
						break;
					} else {
						buf = "";
					}
				}
			}
		} else {
			buf = "";
		}
		return buf;
	}

	/**
	 * 返回空闲字节数
	 * 
	 * @return
	 * @throws Exception
	 */
	public double getFreeDisk() throws Exception {
		String hardDiskInfo = getHardDiskInfo();
		if (hardDiskInfo == null || hardDiskInfo.equals("")) {
			logger.error("get free harddisk space failed.....");
			return -1;
		}
		String[] diskInfo = hardDiskInfo.replace(" ", "").split(",");
		if (diskInfo == null || diskInfo.length == 0) {
			logger.error("get free disk info failed.........");
			return -1;
		}
		String free = diskInfo[2];
		free = free.substring(0, free.indexOf("free"));
		// System.out.println("free space:" + free);
		String unit = free.substring(free.length() - 1);
		// System.out.println("unit:" + unit);
		String freeSpace = free.substring(0, free.length() - 1);
		double freeSpaceL = Double.parseDouble(freeSpace);
		// System.out.println("free spaceL:" + freeSpaceL);
		if (unit.equals("K")) {
			return freeSpaceL * 1024;
		} else if (unit.equals("M")) {
			return freeSpaceL * 1024 * 1024;
		} else if (unit.equals("G")) {
			return freeSpaceL * 1024 * 1024 * 1024;
		} else if (unit.equals("T")) {
			return freeSpaceL * 1024 * 1024 * 1024 * 1024;
		} else if (unit.equals("P")) {
			return freeSpaceL * 1024 * 1024 * 1024 * 1024 * 1024;
		}
		return 0;
	}

	/**
	 * 获取指定目录下的所有子目录及文件
	 * 
	 * @param directory
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public List<String> listFiles(String directory) throws Exception {
		Vector fileList = null;
		List<String> fileNameList = new ArrayList<String>();
		fileList = sftp.ls(directory);
		Iterator it = fileList.iterator();
		while (it.hasNext()) {
			String fileName = ((ChannelSftp.LsEntry) it.next()).getFilename();
			if (fileName.startsWith(".") || fileName.startsWith("..")) {
				continue;
			}
			fileNameList.add(fileName);
		}
		return fileNameList;
	}

	public boolean mkdir(String path) {
		boolean flag = false;
		try {
			sftp.mkdir(path);
			flag = true;
		} catch (SftpException e) {
			flag = false;
		}
		return flag;
	}
	
	
	public static Properties getProperties(String fileName) throws Exception{
		
		Properties p = new Properties();  
        File f = new File(fileName);     
        InputStream in=new FileInputStream(f);
        p.load(in);  
        in.close();
        return p;
        
	}

	public static void main(String[] arg) throws Exception {
		
		/**获取server的数据量*/
		Properties p = getProperties(arg[0]);
        String serverCount=p.getProperty("serverCount");
        if(serverCount==null){
        	 serverCount=p.getProperty("erverCount");
        }
        if(serverCount==null){
        	System.out.println("读取配置文件serverCount失败，请修改配置文件.");
        	return;
        }
		int length = Integer.parseInt(serverCount);
		String serverAdress = null;//server
		String loginId = null;
		String password = null;
		String port = null;
		String uploadFile = null;
		String remoteDir = null;
		String command = null;
		String commandCount = null;
		boolean b = false;
        for(int i=1;i<=length;i++){
        	System.out.println("开始读取第 "+i+" 台服务器");
        	serverAdress = p.getProperty("serverAdress"+i);
        	loginId =  p.getProperty("loginId"+i);
        	password = p.getProperty("password"+i);
        	port =  p.getProperty("port"+i);
        	if(port==null){
        		port="22";
        	}
        	System.out.println("服务器地址 Server = :"+serverAdress+"  LoginId = :"+loginId);
        	Ssh ssh = new Ssh(serverAdress, Integer.parseInt(port), loginId, password);
        	try {
    			ssh.connect();
    			System.out.println("登录第 "+i+" 台服务器成功");
    		} catch (JSchException e) {
    			e.printStackTrace();
    			return;
    		}
        	
        	//上传代码到服务器
        	uploadFile = p.getProperty("uploadFile"+i);
        	remoteDir = p.getProperty("remoteDir"+i);
        	if(uploadFile!=null&&!"".equals(uploadFile)){
        		b = ssh.upload(uploadFile, remoteDir);
        		if(b){
        			System.out.println("上传第 "+i+" 台服务器代码成功");
        		}else{
        			System.out.println("上传第 "+i+" 台服务器代码失败，请检查文件路径.");
        			ssh.disconnect();
        			return;
        		}
        	}
        	commandCount = p.getProperty("commandCount"+i);
        	System.out.println("需要运行"+commandCount+"个命令");
        	
        	if(commandCount!=null&&!"".equals(commandCount)){
        		int commandCnt =  Integer.parseInt(commandCount);
        		for(int j=1;j<=commandCnt;j++){
        			command =  p.getProperty("command"+i+"("+j+")");
                	try {
                		System.out.println("运行命令:"+command);
                		String ss = ssh.execCommand(command,true); 
                		System.out.println("命令结果:"+ss);
                		} catch (Exception e) {
                			System.out.println( e.getMessage()); 
                	}
        		}
                	
        	}
        	ssh.disconnect();
        	System.out.println("结束第"+i+"台服务器");
        }
		
		
		/*Ssh ssh = new Ssh("servername", 22, "username", "password");
		try {
			ssh.connect();
		} catch (JSchException e) {
			e.printStackTrace();
		}*/

		/*
		 * String remotePath = "/home/tfxiaozi/" + "webapp/"; try {
		 * ssh.listFiles(remotePath); } catch (Exception e) {
		 * ssh.mkdir(remotePath); }
		 */

		/* boolean b1 = ssh.upload("d:/Query.sql", "projects/gl_exchange_rate");
		 System.out.println(b1);*/
		 

		// String []buf = ssh.getCpuInfo();
		// System.out.println("cpu:" + buf[0]);
		// System.out.println("memo:" + buf[1]);
		// System.out.println(ssh.getHardDiskInfo().replace(" ", ""));
		// System.out.println(ssh.getFreeDisk());

		/*
		 * List<String> list = ssh.listFiles("webapp/test"); for(String s :
		 * list) { System.out.println(s); }
		 */

		/*
		 * boolean b = ssh.deteleFile("webapp", "test.zip");
		 * System.out.println(b);
		 */

		/*
		 * try { String s = ssh.execCommand("ls -l /home/tfxiaozi/webapp1/test",
		 * true); System.out.println(s); } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		// ssh.sftp.setFilenameEncoding("UTF-8");

		/*
		 * try { String ss = ssh.execCommand(
		 * "unzip /home/tfxiaozi/webapp1/test.zip -d /home/tfxiaozi/webapp1/",
		 * true); System.out.println(ss); } catch (Exception e) {
		 * System.out.println( e.getMessage()); }
		 */

		/*
		 * String path = "/home/tfxiaozi/webapp1/test.zip"; try { List<String>
		 * list = ssh.listFiles(path); for(String s:list) {
		 * System.out.println(s); } System.out.println("ok"); } catch (Exception
		 * e) { System.out.println("extract failed...."); }
		 */

		/*
		 * String command = "rm -rf /home/tfxiaozi/webapp1/" + "水墨国学"; String
		 * sss = ssh.execCommand(command, true); System.out.println(sss);
		 */

		/*
		 * String findCommand =
		 * "find /home/tfxiaozi/webapp1/水墨国学 -name 'index.html'"; String result
		 * = ssh.execCommand(findCommand, true); System.out.println(result);
		 */

		/*
		 * String path = ""; ssh.listFiles(remotePath);
		 */

		/*
		 * ssh.deleteDir("/home/tfxiaozi/webapp1", true);
		 */

		// 下面这个会解压到webapp1目录,webapp1/test/xxx
		// ssh.execCommand("unzip /home/tfxiaozi/webapp1/test.zip -d /home/tfxiaozi/webapp1",
		// true);
		// 下面这个会解压到/webapp1/test目录，也是webapp1/test/test/xxx
		// ssh.execCommand("unzip /home/tfxiaozi/webapp1/test.zip -d /home/tfxiaozi/webapp1",
		// true);

		// ssh.compressDir("/home/tfxiaozi/webapp1", "test.zip");

		// ssh.sftp.cd("/home/tfxiaozi/webapp1");
		// ssh.compressDir("/home/tfxiaozi/webapp1", "test.zip");

		/*
		 * boolean b = ssh.download("d:/temp/test.zip", "webapp/test.zip");
		 * System.out.println(b);
		 */
		// ssh.getHardDiskInfo();
		//System.out.println(ssh.getFreeDisk());
		//ssh.disconnect();
	}

}