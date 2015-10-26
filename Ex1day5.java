
import java.util.Scanner;

public class Ex1day5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello");
        printNumbers(6);
    }

    private static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n-2);
        printNumbers(n-3);
        System.out.println(n);
    }
}