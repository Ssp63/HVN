public class ThreadInfoExample {
    public static void main(String[] args) {
         // Obtain a reference to the currently executing thread
        Thread thread = Thread.currentThread();
        System.out.println("Thread Name: " + thread.getName()); // current name
        System.out.println("Thread ID: " + thread.getId());      
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Thread State: " + thread.getState());
        System.out.println("Thread Group: " + thread.getThreadGroup().getName());
    }
}
