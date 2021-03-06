package Week14.q2;

/**
 * Created by graemewilkinson on 25/01/16.
 */
public class FibMemo {

    public static void main(String[] args) {
        FibMemo test = new FibMemo();
        System.out.println(test.fibmo(45));
        System.out.println(test.fib(45));
        System.out.println(test.fibmo(40));
        System.out.println(test.fib(40));


    }


    public static int fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            int result = fib(n - 1) + fib(n - 2);
            return result;
        }
    }

    private int[] precalculated = null;

    public int fibmo(int n) {
        if (precalculated == null) {
           initPrecalculatedArray(n);

        }
        if (precalculated[n-1] != -1){
            return precalculated[n-1];
        }
        else{
            int result = fibmo(n-1) + fibmo(n-2);
            precalculated[n-1] = result;
            return result;
        }
    }

    private void initPrecalculatedArray(int size) {
        precalculated = new int[size];
        for (int i = 0; i < precalculated.length; i++) {
            precalculated[i] = -1;// to indicate "not calculated yet"
        }
        precalculated[0] = 1;// F(1)
        precalculated[1] = 1; // F(2)
    }
}
