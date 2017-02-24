package thread;

public class AThread extends Thread {

	public void run(){
		int s = 0;
		for(int i=0;i<10;i++){
			s = i;
			System.out.println("AThread run ....."+s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread td = new AThread();
		Thread td1 = new BThread();
		td.run();
		td1.run();
		
	}

}
