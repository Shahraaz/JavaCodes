import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("in.txt");
            out = new FileOutputStream("out.txt");
            int c;
            while ((c = in.read()) != -1) {
                // System.out.println(c);
                out.write(c);
            }
        } finally {
            if (in != null)
                in.close();
            else
                System.out.println("Error Opening input File");
            if (out != null)
                out.close();
            else
                System.out.println("Error Opening output File");
        }
    }
}