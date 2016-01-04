/**
 * Created by graemewilkinson on 04/01/16.
 */
public class NewSmartPhone {
    public static void main(String[] args) {
        SmartPhone myPhone=new SmartPhone();
        myPhone.ringAlarm("Alarm test");
        System.out.println(myPhone.findPosition());
        System.out.println(myPhone.hashCode());
    }
}
