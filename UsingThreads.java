class MyThread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

class MyThread3 extends Thread{
    public void run(){
        System.out.println("Thread 3 is running");
    }
}


public class UsingThreads {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        t1.start();
        t2.start();
        t3.start();
    }
    
}
