public class ThreadStatesExample {
    public static void main(String[] args) throws InterruptedException {
        // New state
        Thread newThread = new Thread(() -> System.out.println("New thread"));
        
        // Runnable state
        Thread runnableThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable thread: " + i);
            }
        });
        
        // Blocked state (by simulating a synchronized block)
        Object lock = new Object();
        Thread blockedThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        // Waiting state
        Thread waitingThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Timed Waiting state
        Thread timedWaitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        // Start threads
        newThread.start();
        runnableThread.start();
        blockedThread.start();
        waitingThread.start();
        timedWaitingThread.start();
        
        // Sleep to allow some time for the threads to change states
        Thread.sleep(1000);
        
        // Blocked thread becomes runnable by notifying it
        synchronized (lock) {
            lock.notify();
        }
        
        // Join threads to wait for their completion
        newThread.join();
        runnableThread.join();
        blockedThread.join();
        waitingThread.join();
        timedWaitingThread.join();
        
        System.out.println("Main thread exiting.");
    }
}