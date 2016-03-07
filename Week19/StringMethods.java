package Week19;

/**
 * Created by graemewilkinson on 29/02/16.
 */
public class StringMethods {
    public static int compare(String o1, String o2){
        return (o1.contains("e") ? -1 : + 1) - (o2.contains("e") ? - 1 : +1);
    }
}
