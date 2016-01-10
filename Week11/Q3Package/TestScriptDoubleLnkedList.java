package Week11.Q3Package;


public class TestScriptDoubleLnkedList
{
	public static void main(String[] args)
	{
		LinkedListEx uch = new LinkedListEx("UCH Hospital");
		uch.addPatient(new DblLinkedListObject("Graeme", 12, "Rabies"));
		uch.addPatient(new DblLinkedListObject("Dan", 22, "Flu"));
		uch.addPatient(new DblLinkedListObject("Phil", 21, "Broken leg"));
		uch.addPatient(new DblLinkedListObject("Mark", 17, "Tummy bug"));
		uch.addPatient(new DblLinkedListObject("Jess", 17, "Tummy bug"));
		uch.addPatient(new DblLinkedListObject("Alice", 17, "Tummy bug"));
		uch.addPatient(new DblLinkedListObject("Harry", 17, "Tummy bug"));
		uch.addPatient(new DblLinkedListObject("Sparky", 17, "Tummy bug"));
		uch.addPatient(new DblLinkedListObject("Fluffy", 17, "Tummy bug"));
		uch.addPatient(new DblLinkedListObject("Samuel", 17, "Tummy bug"));
		uch.addPatient(new DblLinkedListObject("Terry", 17, "Tummy bug"));
		uch.addPatient(new DblLinkedListObject("Simon", 17, "Tummy bug"));
		System.out.println("The number of patients in this hospital is: " + uch.getCount());
		uch.printPatients();
		uch.deletePatientByName("Simon");
		uch.deletePatientByName("Graeme");
		uch.deletePatientByName("Penelope");
		uch.printPatients();
		System.out.println("The number of patients in this hospital is: " + uch.getCount());

		LinkedListEx royal = new LinkedListEx("Royal LinkedListEx");
		royal.addPatient(new DblLinkedListObject("Queen", 89, "Altzheimer"));
		royal.addPatient(new DblLinkedListObject("Simon", 17, "Tummy bug"));
		royal.printPatients();
		System.out.println("The number of patients in this hospital is: " + royal.getCount());

		//DblLinkedListObject patient2 = new Patient("Jake", 32, "large case of boils");
		//patient1.addPatient(patient2);
		//patient1.printPatient();
		//patient1.deletePatient(patient1,"Graeme");
		//System.out.println("Deleting 'Graeme'...");
		//patient1.printPatient();
	}

}