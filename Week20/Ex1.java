package Week20;

import java.util.Arrays;
import java.util.List;

/**
 * Created by graemewilkinson on 07/03/16.
 */
public class Ex1 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello");
        words.stream().forEach(x -> System.out.println("  " + x));
    }


}
