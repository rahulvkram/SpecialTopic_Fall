public class DaemonThreadExample {
    public static void main(String[] args) {
        // Create a daemon thread
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true); // Set the thread as a daemon thread
        daemonThread.start();

        // Create a non-daemon thread
        Thread nonDaemonThread = new Thread(new NonDaemonTask());
        nonDaemonThread.start();

        System.out.println("Main thread exiting.");
    }
}

class DaemonTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon Thread is running.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NonDaemonTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Non-Daemon Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}