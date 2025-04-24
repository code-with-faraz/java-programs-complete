class BlockThread extends Thread{
    public void run(){
        System.out.println("Thread is going to sleep... ");
        try {
            Thread.sleep(5000); //Thread sleeps for 5 second
        }catch (InterruptedException e){
            System.out.println("Thread is interrupted!");
        }
        System.out.println("Thread is awake!");
    }
}


public class BlockingThread {
    public static void main(String[] args){
        BlockThread t1 = new BlockThread(); //Creation of a thread
        t1.start(); //Starting the thread
    }
    
}
