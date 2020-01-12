import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ReadObject
 */
public class ReadObject {

    public static void main(String[] args) {
        ReadObject obj = new ReadObject();
        Address address = obj.desearializeAddress(
                "/home/shahraaz/Documents/JavaCodes/Java-Object_Oriented_Programming/IO_Streams/address.ser");
        System.out.println(address);
    }

    public Address desearializeAddress(String fileName) {
        Address address = null;
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try {
            fin = new FileInputStream(fileName);
            ois = new ObjectInputStream(fin);
            address = (Address) ois.readObject();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        return address;
    }
}