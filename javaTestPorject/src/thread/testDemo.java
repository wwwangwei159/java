package thread;

public class testDemo {

	class BThread extends Thread {
		public BThread() {
			super("[BThread] Thread");
		};

		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " start.");
			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(threadName + " loop at " + i);
					Thread.sleep(1000);
				}
				System.out.println(threadName + " end.");
			} catch (Exception e) {
				System.out.println("Exception from " + threadName + ".run");
			}
		}
	}

	class AThread extends Thread {
		BThread bt;

		public AThread(BThread bt) {
			super("[AThread] Thread");
			this.bt = bt;
		}

		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " start.");
			try {
				//bt.join();
				System.out.println(threadName + " end.");
			} catch (Exception e) {
				System.out.println("Exception from " + threadName + ".run");
			}
		}
	}

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " start.");
		testDemo test = new testDemo();
		BThread bt = test.new BThread();
		AThread at = test.new AThread(bt);
		try {
			bt.start();
			Thread.sleep(2000);
			at.start();
			//at.join();
		} catch (Exception e) {
			System.out.println("Exception from main");
		}
		System.out.println(threadName + " end!");
	}

}