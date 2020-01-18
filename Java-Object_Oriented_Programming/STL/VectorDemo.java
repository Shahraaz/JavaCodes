import java.util.Vector;

/**
 * VectorDemo
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> vc = new Vector<String>();

        vc.add("First");
        vc.add("Second");
        vc.add("Third");

        System.out.println(vc);

        vc.add(2,"Specified Index");
        System.out.println(vc);

        System.out.println("elem at index 3 " + vc.get(3));
        System.out.println("First Element " + vc.firstElement());
        System.out.println("Last Element " + vc.lastElement());
    }
}