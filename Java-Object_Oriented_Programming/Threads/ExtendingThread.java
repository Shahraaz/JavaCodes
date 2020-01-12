// package ThreadDemo;

public class ExtendingThread extends Thread{
    public void run()
    {
        System.out.println("Thread is running\n");
    }
    public static void main(String[] args)
    {
        ExtendingThread t1 = new ExtendingThread();
        t1.start();
    }
}