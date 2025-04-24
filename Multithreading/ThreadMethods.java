class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " woke up!");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start();
        t2.start();

        t1.join(); // Main waits for t1 to finish
        t2.join(); // Main waits for t2 to finish

        System.out.println("Both threads have finished execution!");
    }
}
