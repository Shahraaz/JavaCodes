import java.net.URL;

/**
 * TryAndFinallyDemo
 */
public class TryAndFinallyDemo {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception " + e.getMessage());
            e.printStackTrace();
        } finally {
            // TODO: handle exception
            System.out.println("Inside Finally");
        }
    }
}