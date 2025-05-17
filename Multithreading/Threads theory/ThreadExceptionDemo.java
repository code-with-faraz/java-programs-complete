class MyThread extends Thread {
    public void run() {
        try {
            // NullPointerException
            String str = null;
            System.out.println(str.length()); // Will throw NullPointerException

            // InterruptedException
            System.out.println("Thread sleeping...");
            Thread.sleep(1000); // Might be interrupted
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        }

        // RuntimeException
        int a = 10 / 0; // This will throw ArithmeticException (a subclass of RuntimeException)
    }
}

public class ThreadExceptionDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        try {
            // Start the thread
            t1.start();

            // Wait a bit and interrupt the thread
            Thread.sleep(100);
            t1.interrupt();

            // IllegalThreadStateException
            t1.start(); // Starting the same thread again will throw IllegalThreadStateException

        } catch (IllegalThreadStateException e) {
            System.out.println("IllegalThreadStateException caught: " + e);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException in main: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }
}