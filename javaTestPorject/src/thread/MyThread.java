package thread;

public class MyThread {

	private int ticket = 5;

	private Object object = new Object();

	class AThread extends Thread {

		public AThread() {
			super("[AThread]");
		};

		@Override
		public void run() {

			synchronized (object) {
				String threadName = Thread.currentThread().getName();

				System.out.println("-----" + threadName);

				/*try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/

				for (int i = 0; i < 10; i++) {

					System.out.println(threadName + "-------" + i);

					if (ticket > 0) {
						System.out.println(threadName + "------------"
								+ ticket--);
					}

				}
			}

		}

	}

	class BThread extends Thread {

		public BThread() {
			super("[BThread]");
		};

		@Override
		public void run() {

			synchronized (object) {

				String threadName = Thread.currentThread().getName();

				System.out.println("-----" + threadName);

				/*try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/

				for (int i = 0; i < 10; i++) {

					System.out.println(threadName + "-------" + i);

					if (ticket > 0) {
						System.out.println(threadName + "------------"
								+ ticket--);
					}

				}
			}

		}

	}

	public static void main(String[] args) {
		System.out.println("-----" + Thread.currentThread().getPriority());
		MyThread td1 = new MyThread();
		AThread a = td1.new AThread();

		BThread b = td1.new BThread();
		a.start();
		b.start();

	}

}
