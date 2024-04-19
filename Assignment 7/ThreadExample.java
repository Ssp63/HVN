class MyThread extends Thread {
    public void run() {                                            // override run
        System.out.println("Thread running...");
    }
}

class MyRunnable implements Runnable {               // runnable interface class
    // Override the run method to define the behavior of the thread
    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();         // Create an instance of MyThread
        t1.start();
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
