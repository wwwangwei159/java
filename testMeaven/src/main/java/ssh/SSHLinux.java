package ssh;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSHLinux {

	 public static Session session = null;
	 
	 public static ChannelExec channelExec = null;
	 
	public static void main(String[] args) throws IOException, JSchException {
		// TODO Auto-generated method stub
		String host = "777";
		int port = 22;
		String user = "";
		String password = "";
		exeCommand(host,port,user,password);
		String command = "cd projects";
		exec(command);
		command = "ll projects";
		String res = exec(command);
		System.out.println(res);
		
		
		channelExec.disconnect();
		session.connect(30000);
		session.disconnect();
		
		
	}
	
	
	public static void exeCommand(String host, int port, String user, String password) throws JSchException, IOException {
        
        JSch jsch = new JSch();
        session = jsch.getSession(user, host, port);
        session.setConfig("StrictHostKeyChecking", "no");
    //    java.util.Properties config = new java.util.Properties();
     //   config.put("StrictHostKeyChecking", "no");
        
        session.setPassword(password);
        session.connect();
        
        
        
    }
	
	
	
	public static String exec(String command) throws JSchException, IOException{
		
		    channelExec = (ChannelExec) session.openChannel("exec");
	        InputStream in = channelExec.getInputStream();
	        channelExec.setCommand(command);
	        channelExec.setErrStream(System.err);
	        channelExec.connect();
	        String out = IOUtils.toString(in, "UTF-8");
	       

	        return out;
	}
	
	public String execCommand(String command, boolean flag) {
		  Channel channel = null;
		  InputStream in = null;
		  StringBuffer sb = new StringBuffer("");
		  try {
		   channel = session.openChannel("exec");
		   System.out.println("command:" + command);
		   ((ChannelExec)channel).setCommand("export TERM=ansi && " + command);
		   ((ChannelExec)channel).setErrStream(System.err);
		   in = channel.getInputStream();
		   channel.connect();
		   if (flag) {
		    byte[] tmp = new byte[10240];
		    while (true) {
		     while (in.available()>0) {
		      int i = in.read(tmp, 0, 10240);
		      if(i < 0) {
		       break;
		      }
		      sb.append(new String(tmp, 0, i));
		     }
		     if (channel.isClosed()){
		      break;
		     }
		    }
		   }
		   in.close();
		  } catch(Exception e){
			  
		  } finally {
		   if (channel != null) {
		    channel.disconnect();
		   }
		  }
		  return sb.toString();
		 }

}
