package Week14.q3;

import java.util.ArrayList;
import java.util.List;

public class HailstoneNumbers {

    public static void main(String[] args) {
        HailstoneNumbers test = new HailstoneNumbers();
        test.hail(3);
            System.out.println(test.result);

        }

    List<Integer> result = new ArrayList<Integer>();

    public void hail(int n) {
        int temp;
        if (n % 2 == 0) {
            temp = n / 2;
        } else {
            temp = 3 * n + 1;
        }
        result.add(temp);
        if (temp == 1) {
            return;
        }
        hail(temp);

    }
}