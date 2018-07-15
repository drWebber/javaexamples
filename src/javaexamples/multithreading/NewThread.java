package javaexamples.multithreading;

import java.util.Random;

public class NewThread implements Runnable {
    private Thread thread;
    private String name;

    public NewThread(String threadName) {
        name = threadName;
        thread = new Thread(this, name);
        System.out.println("The thread " + name + " has been started");
        thread.start();        
    }

    public Thread getThread() {
        return thread;
    }
    
    @Override
    public void run() {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("The child thread " + name + " :" + i);
            try {
                Thread.sleep(rnd.nextInt(1500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
