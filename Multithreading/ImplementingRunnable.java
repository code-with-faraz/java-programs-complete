class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using runnable... ");
    }
}

public class ImplementingRunnable {
    public static void main(String[] args){
        MyRunnable R = new MyRunnable();
        Thread t1 = new Thread(R); //passing runnable to Thread
        t1.start();   //starting the thread
    }
    
}
