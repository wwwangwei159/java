

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.telnet.TelnetClient;

/**
 * 
 * @author wonderl
 *
 *
 */
public class TelnetHelper {
	public static final int TELNET_PORT = 21;
	private FTPClient telnet = new FTPClient();
	private BufferedReader in;
	private PrintStream out;
	private String endResponseFlag = java.util.UUID.randomUUID().toString();
	private String server;
	private String user;
	private String password;

	
	public TelnetHelper(String server, String user, String password) {
		this.server = server;
		this.user = user;
		this.password = password;
	}
	
	public void connect() throws Exception{
		try{
			// Connect to the specified server
			telnet.connect(server);
			telnet.setDefaultPort(TELNET_PORT);
			telnet.login(user, password);
		}catch(Exception e){
			throw new Exception("Cant't connect to "+server);
		}
		

		// Get input and output stream references
		in = new BufferedReader(new InputStreamReader( telnet.getInputStream()));
		out = new PrintStream(telnet.getOutputStream());

		// Log the user on
		//String res = "";
		//readUntil("login: ");
		//System.out.println("1: "+res);
		//write(user);
		//readUntil("Password: ");
		//System.out.println("2: "+res);
		//write(password);
		//System.out.println(3);
		//checkLogin();
		//System.out.println("3: "+res);	
	}

	public String readUntil(String pattern) {
		try {
			char lastChar = pattern.charAt(pattern.length() - 1);
			StringBuffer sb = new StringBuffer();
			char ch = (char) in.read();
			while (true) {
				//System.out.print(ch);
				sb.append(ch);
				//System.out.println(sb.toString());
				if (ch == lastChar) {
					if (sb.toString().endsWith(pattern)) {
						return sb.toString();
					}
				}
				ch = (char) in.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public StringBuffer readUntil() throws Exception{
		StringBuffer sb = new StringBuffer();
		try {
			while (true) {
				String responeLine = in.readLine();
				//System.out.println(responeLine);
				if(responeLine.contains(endResponseFlag)){
					break;
				}
				sb.append(responeLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public void checkLogin() throws Exception{
		String responeLine = in.readLine();
		//System.out.println(responeLine);
		if(responeLine.contains("Login incorrect")){
			throw new Exception("Invalid name or password.");
		}
	}

	public void write(String value) {
		try {
			out.println(value);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public StringBuffer sendCommand(String command) {
		if(command==null || command.trim().length()==0){
			return new StringBuffer();
		}
		
		try {
			write(command +"; echo "+endResponseFlag);
			return readUntil();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void disconnect() {
		try {
			if(telnet != null && telnet.isConnected()) {
				telnet.disconnect();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TelnetHelper telnetHelper = new TelnetHelper("", "","");
		try {
			telnetHelper.connect();
			String[] cmds = new String[]{"ls","pwd"};

			for(int i=0;i<cmds.length;i++){
				StringBuffer res = telnetHelper.sendCommand(cmds[i]);
				System.out.println(cmds[i]);
				System.out.println(res);
			}
			telnetHelper.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			telnetHelper.disconnect();
		}
	}
}

