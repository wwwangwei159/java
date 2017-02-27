package thread;

public class WaitNotifyDemo {

	
	private volatile int i = 1;
	
	private synchronized void printAndIncrease(){
		System.out.println(Thread.currentThread().getName()+"===i=========="+i);
		i++;
		
	}
	
	public class PrintA implements Runnable{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			while(i<=3){
				printAndIncrease();
			}
			
			synchronized (WaitNotifyDemo.this) {
				
				System.out.println("prinetd 1,2,3 ;notify PrintB;");
				
				WaitNotifyDemo.this.notify();
				
			}
			
			while(i<=6){
				synchronized (WaitNotifyDemo.this) {
					System.out.println("watting for PrintB");
					try {
						WaitNotifyDemo.this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			while(i<=9){
				printAndIncrease();
			}
			System.out.println("PrintA existes......");
			
		}
		
	}
	
	public class PrintB implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			while(i<=3){
				synchronized (WaitNotifyDemo.this) {
					try {
						System.out.println("printB waitting for PrintA");
						WaitNotifyDemo.this.wait();
						System.out.println("printB waitting for PrintA finished");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			
			while(i<=6){
				printAndIncrease();
			}
			
			System.out.println("notify in printB");
			
			synchronized (WaitNotifyDemo.this) {
				WaitNotifyDemo.this.notify();
			}
			
			System.out.println("notify end printerB");
			System.out.println("PrinterB exits.");
			
		}
		
	}
	
	
	public void doPrint(){
		
		PrintA a = new PrintA();
		PrintB b = new PrintB();
		Thread tha = new Thread(a);
		Thread thb = new Thread(b);
		tha.setName("Thread A");
		thb.setName("Thread B");
		tha.start();
		thb.start();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaitNotifyDemo demo = new WaitNotifyDemo();
		demo.doPrint();
		
	}


	

}
