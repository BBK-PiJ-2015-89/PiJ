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
        int top = 0;
        while (top == 0) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter number of numbers you'd like to enter");
                top = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("That's not an int");
            }
        }
        while (counter <= top) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter int number " + counter);
                total = total + input.nextInt();
                counter++;
            } catch (InputMismatchException ex) {
                System.out.println("That's not an int");
            }
        }

        System.out.println("Average: " + total / top);
    }


}
