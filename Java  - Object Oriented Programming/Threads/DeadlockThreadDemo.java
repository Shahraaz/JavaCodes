public class DeadlockThreadDemo {
    public static void main(String[] args) {
        final String resource1 = "Shahraaz";
        final String resource2 = "Hussain";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("THread 1: locked resources 1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized(resource2){
                        System.out.println("Thread 1: Locked resources 2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("THread 2: locked resources 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized(resource1){
                        System.out.println("Thread 2: Locked resources 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}