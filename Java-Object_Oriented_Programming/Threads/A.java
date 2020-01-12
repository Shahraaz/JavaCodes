public class A{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("My Thread");
        System.out.println(t.getName());
 
        System.out.println(t.getId());
 
        System.out.println("Default Priority " + t.getPriority());
        t.setPriority(10);
        System.out.println("Current Priority " + t.getPriority());

        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

        System.out.println("Default State " + t.getState());
        // System.out.println("Current Priority " + t.getPriority());

    }
}