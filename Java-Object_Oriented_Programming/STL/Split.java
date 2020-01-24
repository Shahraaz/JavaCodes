/**
 * Split
 */
public class Split {

    public static void main(String[] args) {
        String str = "One:two:three";
        String split[] = str.split(":");
        for (String string : split) {
            System.out.println(string);
        }
    }
}