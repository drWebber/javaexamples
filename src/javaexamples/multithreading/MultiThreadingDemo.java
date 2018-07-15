package javaexamples.multithreading;

public class MultiThreadingDemo {
    public void call() {
        NewThread t1 = new NewThread("A");
        NewThread t2 = new NewThread("B");
        NewThread t3 = new NewThread("C");
        ExtendedThread et = new ExtendedThread();
        
        try {
            t1.getThread().join();
            t2.getThread().join();
            t3.getThread().join();
            et.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Producer & consumer example:");
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        
        System.out.println("All threads has been finished");
    }
}
