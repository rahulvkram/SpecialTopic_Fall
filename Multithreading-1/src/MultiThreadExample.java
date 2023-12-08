

public class MultiThreadExample {
	    public static void main(String[] args) {
	        // Create two threads
	        Thread thread1 = new Thread(new NumberPrinter());
	        Thread thread2 = new Thread(new LetterPrinter());

	        // Start the threads
	        thread1.start();
	        thread2.start();

	        // Wait for both threads to finish
	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread exiting.");
	    }
	}

	class NumberPrinter implements Runnable {
	    @Override
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            try {
	                Thread.sleep(1000); // Simulate some work
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println("Thread 1: " + i);
	        }
	    }
	}

	class LetterPrinter implements Runnable {
	    @Override
	    public void run() {
	        for (char letter = 'A'; letter <= 'E'; letter++) {
	            try {
	                Thread.sleep(1000); // Simulate some work
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println("Thread 2: " + letter);
	        }
	    }
	}

