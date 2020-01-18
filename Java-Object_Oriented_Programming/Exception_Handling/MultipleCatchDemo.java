import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

/**
 * MultipleCatchDemo
 */
public class MultipleCatchDemo {

    public static void main(String[] args) {
        MultipleCatchDemo ex = new MultipleCatchDemo();
        ex.execute(1);
        ex.execute(2);
    }

    public void execute(int i) {
        try {
            if (i == 1) {
                getIntValue("110");
                System.out.println("Chillin INt");
            } else {
                URL u = new URL("http://www.google.com");
                // getUrlObj("http://www.google.com");
                System.out.println("Chillin URL");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Inside NFE " + nfe.getMessage());
        } catch (MalformedURLException mue) {
            System.out.println("Inside MUE " + mue.getMessage());
        } catch (Exception ex) {
            System.out.println("Inside ex " + ex.getMessage());
        }
    }

    public int getIntValue(String num) {
        return Integer.parseInt(num);
    }

    public URL getUrlObj(String num) {
        return new URL(num);
    }

}