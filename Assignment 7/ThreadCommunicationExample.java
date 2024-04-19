class SharedResource {
    private int count = 0;

    public synchronized void increment() { // synchronized method to increment the count
        while (count >= 5) {
            try {
                wait();      // wait until count is < than 5
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println("Incremented: " + count);
        notify();
    }

    public synchronized void decrement() { // method to decrement the count
        while (count <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println("Decremented: " + count);
        notify();
    }
}

class IncrementThread extends Thread {
    // Declare a private variable to hold the reference to the shared resource
    private SharedResource sharedResource;

    // Constructor to initialize the shared resource
    public IncrementThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment();
        }
    }
}

class DecrementThread extends Thread {
    private SharedResource sharedResource;
    public DecrementThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    // Override the run method to define the behavior of the thread
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.decrement();
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        IncrementThread incrementThread = new IncrementThread(sharedResource);
        DecrementThread decrementThread = new DecrementThread(sharedResource);
        incrementThread.start();         // Start the increment thread
        decrementThread.start();        // Start the decrement thread
    }
}
   
