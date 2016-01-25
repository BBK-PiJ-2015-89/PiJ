package Week14.q1;

/**
 * Created by graemewilkinson on 25/01/16.
 */
public class Onea {

    public static void main(String[] args) {
        Onea test = new Onea();
        System.out.println(test.doggyMethod(10));
    }

    String doggyMethod(int n) {
        if (n <= 0){
            return "";
        }
        return doggyMethod(n-3) + n + doggyMethod(n-2);
    }
}

