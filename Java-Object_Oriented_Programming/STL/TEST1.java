import java.util.ArrayList;

/**
 * TEST1
 */
public class TEST1 {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        System.out.println("Initial Size of array " + a1.size());
        a1.add("a");
        a1.add("b");
        a1.add("x");
        a1.add("y");
        a1.add("z");
        a1.add(1, "A1");
        System.out.println("Final Size of array " + a1.size());
        System.out.println(a1);        
    }
}