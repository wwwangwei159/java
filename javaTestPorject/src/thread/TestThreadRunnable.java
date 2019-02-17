package thread;

public class TestThreadRunnable {

    public static void main(String[] args) {

        new Thread(new BThreadRunnable()).start();
        new Thread(new AThreadRunnable()).start();
    }


}
