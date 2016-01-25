package Week11.Q5;

/**
 * Created by graemewilkinson on 10/01/16.
 */
public class StackTestScript {

    public static void main(String[] args) {
        StackTestScript stc = new StackTestScript();

        stc.launch1();
        stc.launch2();
        /*stc.launch3();*/
    }

    private void launch1() {
        Stack<Integer> stc1 = new Stack<Integer>();
        stc1.push(8);
        stc1.push(0);
        stc1.pop();

    }
    private void launch2() {
        Stack<Double> stc2 = new Stack<Double>();
        stc2.push(3.0);

    }

    /*private void launch3() {
        Stack<String> stc3 = new Stack<String>();
        stc3.push("Graeme");

        //will not compile as not compatible with extends Number.
    }*/


}
