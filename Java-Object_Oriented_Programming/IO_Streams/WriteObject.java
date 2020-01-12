import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * WriteObject
 */
public class WriteObject {

    public static void main(String[] args) {
        WriteObject obj = new WriteObject();

        Address address = new Address();
        address.setCountry("india");
        address.setStreet("hsr layout");
        address.setMobile(123);
        obj.serializeAddress(address);
    }

    public void serializeAddress(Address address) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream(
                    "/home/shahraaz/Documents/JavaCodes/Java-Object_Oriented_Programming/IO_Streams/address.ser");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(address);
            System.out.println("Done");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
    }
}