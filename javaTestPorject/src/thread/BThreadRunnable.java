package thread;

public class BThreadRunnable implements Runnable {

	public void run(){

		for(int i=0;i<10;i++){
			System.out.println("----BThread---"+i);

			try {
				Thread.sleep(Math.round(10) * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
