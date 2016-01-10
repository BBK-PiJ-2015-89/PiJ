package Week11.Q2Package;

/**
 * Created by graemewilkinson on 09/01/16.
 */
public class Q2 {

    //public static MobilePhone myPhone;

    public static void main(String[] args) {
        test1();
        test2();
//        test3(myPhone);
//        test4(myPhone);
    }

    private static void test1() {
        SmartPhone myPhone = new SmartPhone();
        myPhone.call("Mum");
        myPhone.browseWeb("www.google.co.uk");
        myPhone.playGame("Snake");
        myPhone.ringAlarm("8am");
    }

    //2.2 won't compile browseWeb
    private static void test2() {
        Phone myPhone = new SmartPhone();
        myPhone.call("Mum");
        ((SmartPhone)myPhone).browseWeb("www.google.co.uk");
        ((SmartPhone)myPhone).playGame("Snake");
        ((SmartPhone)myPhone).ringAlarm("8am");

    }
    //2.2 above will now compile with this direct upcasting method.

    /*private static void test3(Phone p){
        p.call("Mum");
//        p.browseWeb("www.google.co.uk");
//        p.playGame("Snake");
//        p.ringAlarm("8am");
//only call works
    }*/

    /*private static void test4(Phone p){
        SmartPhone sp = (SmartPhone) p;
        sp.ringAlarm("8am");
        sp.findPosition();
        sp.printLastNumbers();*/



    }
