public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create two threads that access the shared resource
        Thread thread1 = new Thread(new MyRunnable(sharedResource));
        Thread thread2 = new Thread(new MyRunnable(sharedResource));

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    private int sharedValue = 0;

    // Method to perform some critical section of code
    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (++sharedValue));
        }
    }
}

class MyRunnable implements Runnable {
    private final SharedResource sharedResource;

    public MyRunnable(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.increment();
    }
}