/**
 * Created by graemewilkinson on 04/01/16.
 */
public class NewSmartPhone {
    public static void main(String[] args) {
        MobilePhone myPhone=new SmartPhone();
        SmartPhone mysmartphone =(SmartPhone)myPhone;
        mysmartphone.ringAlarm("Alarm test");
        System.out.println(mysmartphone.findPosition());
        System.out.println(mysmartphone.hashCode());
    }
}
