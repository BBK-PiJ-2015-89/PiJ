package Week16;
import java.io.*;
/**
 * Created by graemewilkinson on 08/02/16.
 */
public class MakeDir {

    public static void main(String[] args) {
        File newDirectory = new File(args[0]);
        newDirectory.mkdir();

    }
}
