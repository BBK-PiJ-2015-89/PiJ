package Week14.q1;

/**
 * Created by graemewilkinson on 25/01/16.
 */
public class Twob {

    public static void main(String[] args) {
        Twob test = new Twob();
        System.out.println(test.mcCarthy91(50));
        System.out.println(test.mcCarthy91(73));
        System.out.println(test.mcCarthy91(95));
    }

    int mcCarthy91(int n){
        if (n> 100){
            System.out.println(n + (n-10));
            return n - 10;
        }
        else{
            return mcCarthy91(mcCarthy91(n+11));
        }
    }
}
