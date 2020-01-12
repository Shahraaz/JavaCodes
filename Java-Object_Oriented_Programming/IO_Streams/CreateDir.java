import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirName = "/home/shahraaz/Documents/JavaCodes/Java-Object_Oriented_Programming/IO_Streams/newDir";
        File d = new File(dirName);
        d.mkdirs();
    }
}