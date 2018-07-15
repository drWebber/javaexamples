package javaexamples.multithreading;

public class ExtendedThread extends Thread {
    public ExtendedThread() {
        super("extended thread");
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("extended thread: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
