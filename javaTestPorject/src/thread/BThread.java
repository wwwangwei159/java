package thread;

public class BThread extends Thread {

	public void run(){
		
		for(int i=0;i<10;i++){
			System.out.println("----BThread---"+i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
