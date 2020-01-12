// package ThreadDemo;

public class RunnableDemo implements Runnable{
    public void run()
    {
        System.out.println("thread is running\n");
    }
    public static void main(String args[])
    {
        RunnableDemo m1 = new RunnableDemo();
        Thread t1 = new Thread(m1);
        t1.start();
        Thread t2 = new Thread(m1);
        t2.start();
    }
}