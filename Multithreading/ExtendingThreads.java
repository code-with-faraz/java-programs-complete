class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
}

public class ExtendingThreads{
    public static void main(String[] args){
        MyThread t = new MyThread(); //Creating a thread

        t.start(); //starting a thread
    }
}