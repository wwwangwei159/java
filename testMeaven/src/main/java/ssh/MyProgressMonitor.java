package ssh;

import com.jcraft.jsch.SftpProgressMonitor;

public class MyProgressMonitor implements SftpProgressMonitor {
private long transfered;
	@Override
    public boolean count(long count) {
        transfered = transfered + count;
        if(transfered<1024)
        {
               System.out.println("Currently transferred total size: " + transfered + " bytes");
        }
        if ((transfered> 1024) && (transfered<1048576))
        {
               System.out.println("Currently transferred total size: " + (transfered/1024) + "K bytes");
        }
        else
        {
               System.out.println("Currently transferred total size: " +( transfered/1024/1024) + "M bytes");
        }
        return true;
    }
 
    @Override
    public void end() {
        System.out.println("Transferring done.");
    }
 
    @Override
    public void init(int op, String src, String dest, long max) {
        System.out.println("Transferring begin.");
    }
}