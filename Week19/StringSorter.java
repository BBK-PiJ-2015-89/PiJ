package Week19;

import java.util.Arrays;

/**
 * Created by graemewilkinson on 29/02/16.
 */
public class StringSorter {

    public static void main(String[] args) {
        StringSorter a = new StringSorter();
        a.launch();
    }

    private void launch(){
        String[] initialArray = {"a", "test", "b", "c", "d"};
        Arrays.sort(initialArray, StringMethods::compare);
        System.out.println(Arrays.asList(initialArray));
    }
}
