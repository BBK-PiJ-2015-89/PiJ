
import java.util.Scanner;

public class Binaryanddectsk { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please choose an option");
        System.out.println("Key 1 for converting decimal to binary");
        System.out.println("Key 2 for converting binary to decimal");
        int num = input.nextInt();
        switch(num) {
            case 1:
                System.out.println("Enter a decimal number to be converted to a binary");
                int number = input.nextInt();
                String converted = decimal2binary(number);
                System.out.println("Your Binary number is " + converted);
                break;
            case 2:
                System.out.println("Enter a binary number:");
                input.nextLine();
                String stri = input.nextLine();
                int binaryresult = binary2decimal(stri);
                System.out.println("Value of binary number is: " + binaryresult);
                break;
        }
    }

    private static int power2(int pwr2)
{
        int calc = power(2, pwr2);
        return calc;
    }

    private static int power(int base, int exponent)
{
        int result = 1;
        for (int i=0; i<exponent; i++)
	{
            result = result * base;
        }
        return result;
    }

    private static int binary2decimal(String str)
{
        int binary = 0;
        int length = str.length();
        for (int count = 0; count<length; count++)
	{
            String current = str.substring(count,count);
            if (str.charAt(count) == '1')
		{
                int power = length-count-1;
                int digitresult = power2(power);
                binary = binary + digitresult;
            }
        }
        return binary;
    }

    private static String decimal2binary(int num)
{
        String converted = "";
        while(num>0)
	{
            converted += (num % 2 != 0) ? "1" : "0";
            num = num/2;
        }
        int len = converted.length();
        String reverse = "";
        for(int i = len -1; i>=0; i--)
	{
            reverse += converted.charAt(i);
        }
        return reverse;
    }
}