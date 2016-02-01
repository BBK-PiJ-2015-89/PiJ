package Week15;

import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by graemewilkinson on 01/02/16.
 */
public class ProgrammeRead10 {

    public static void main(String[] args) {
        int total = 0;
        int counter = 1;
        while(counter <11){
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter int number " + counter);
                total = total + input.nextInt();
                counter ++;
            } catch (InputMismatchException ex) {
                System.out.println("That's not an int");
            }
        }

        System.out.println("Average: " + total / 10);
    }


}
