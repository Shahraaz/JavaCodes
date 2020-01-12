import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharecters {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("in.txt");
            outputStream = new FileWriter("output.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
                System.out.println(c);
            }
        } finally {
            // TODO: handle exception
            if (inputStream != null)
                inputStream.close();
            if (outputStream != null)
                outputStream.close();
        }
    }
}