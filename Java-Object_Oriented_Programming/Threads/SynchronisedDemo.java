class Value {
    synchronized void printValue(int n) {
        for (int i = 1; i <= 3; ++i) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Value v;

    MyThread1(Value v) {
        this.v = v;
    }

    public void run() {
        v.printValue(5);
    }
}

class MyThread2 extends Thread {
    Value v;

    MyThread2(Value v) {
        this.v = v;
    }

    public void run() {
        v.printValue(100);
    }
}

class Value2 {
    void printValue(int n) {
        synchronized(this)
        {
            for (int i = 1; i <= 3; ++i) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }    
        }
    }
}

class MyThread12 extends Thread {
    Value2 v;

    MyThread12(Value2 v) {
        this.v = v;
    }

    public void run() {
        v.printValue(5);
    }
}

class MyThread22 extends Thread {
    Value2 v;

    MyThread22(Value2 v) {
        this.v = v;
    }

    public void run() {
        v.printValue(100);
    }
}

public class SynchronisedDemo {
    public static void main(String[] args) {
        // Value obj = new Value();
        // MyThread1 t1 = new MyThread1(obj);
        // MyThread2 t2 = new MyThread2(obj);
        // t1.start();
        // t2.start();

        Value2 obj2 = new Value2();
        MyThread12 t12 = new MyThread12(obj2);
        MyThread22 t22 = new MyThread22(obj2);
        t12.start();
        t22.start();
    }
}