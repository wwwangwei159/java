package thread;

public class AThreadRunnable implements Runnable {

	public void run(){
		int s = 0;
		for(int i=0;i<10;i++){
			s = i;
			try {
				Thread.sleep(Math.round(10) * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("AThread run ....."+s);
		}
	}

	public static void main(String[] args) {

		new Thread(new BThreadRunnable()).start();
		new Thread(new AThreadRunnable()).start();
	}


}
