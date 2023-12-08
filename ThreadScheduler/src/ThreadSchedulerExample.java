public class ThreadSchedulerExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Thread 1"));
        Thread thread2 = new Thread(new Task("Thread 2"));

        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable {
    private final String threadName;

    public Task(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": " + i);

            try {
                // Introduce a delay to simulate thread scheduling
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}