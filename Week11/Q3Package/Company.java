package Week11.Q3Package;

/**
 * Created by graemewilkinson on 10/01/16.
 */
public class Company {

    public static void main(String[] args) {
        LinkedListEx<String> names = new LinkedListEx<String>("Names Database");
        names.addPatient(new DblLinkedListObject<String>("Harry"));
        names.addPatient(new DblLinkedListObject<String>("Graeme"));
        System.out.println(names.getCount());
        LinkedListEx<Integer> nationalInsurance = new LinkedListEx<Integer>("National Insurance Database");
        nationalInsurance.addPatient(new DblLinkedListObject<Integer>(1234567));
        nationalInsurance.addPatient(new DblLinkedListObject<Integer>(1234567));
        System.out.println(nationalInsurance.getCount());

    }
}
