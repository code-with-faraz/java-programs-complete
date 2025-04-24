//Stopping a Thread using a flag
class MyThread extends Thread {
    private boolean running = true; //Flag to control the thread execution

    public void run() { 
        while (running) {
            System.out.println("Thread is running... ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted!");
            }
            
        }
     System.out.println("Thread is stopped!");
    }

    public void stopThread() {
        running = false; //Set flag to false to stop the thread
    }
}

public class StoppingThread{
    public static void main(String[] args) throws InterruptedException{ 

        MyThread t = new MyThread();
        t.start(); //Starting the thread

        Thread.sleep(5000); //Let the thread run for five seconds
        t.stopThread(); //Stop the thread

    }
}