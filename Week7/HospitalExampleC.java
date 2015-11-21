public class HospitalExampleC
{
	public static void main(String[] args)
	{
		HospitalC uch = new HospitalC("UCH Hospital");
		uch.addPatient(new Patient("Graeme", 12, "Rabies"));
		uch.addPatient(new Patient("Dan", 22, "Flu"));
		uch.addPatient(new Patient("Phil", 21, "Broken leg"));
		uch.addPatient(new Patient("Mark", 17, "Tummy bug"));
		uch.addPatient(new Patient("Jess", 17, "Tummy bug"));
		uch.addPatient(new Patient("Alice", 17, "Tummy bug"));
		uch.addPatient(new Patient("Harry", 17, "Tummy bug"));
		uch.addPatient(new Patient("Sparky", 17, "Tummy bug"));
		uch.addPatient(new Patient("Fluffy", 17, "Tummy bug"));
		uch.addPatient(new Patient("Samuel", 17, "Tummy bug"));
		uch.addPatient(new Patient("Terry", 17, "Tummy bug"));
		uch.addPatient(new Patient("Simon", 17, "Tummy bug"));
		System.out.println("The number of patients in this hospital is: " + uch.getCount());
		uch.printPatients();
		uch.deletePatientByName("Simon");
		uch.deletePatientByName("Peter");
		uch.deletePatientByName("Sparky");
		uch.addPatient(new Patient("Pierre", 17, "Tummy bug"));
		uch.printPatients();
		System.out.println("The number of patients in this hospital is: " + uch.getCount());

		HospitalC royal = new HospitalC("Royal Hospital");
		royal.addPatient(new Patient("Queen", 89, "Altzheimer"));
		royal.addPatient(new Patient("john", 67, "Altzheimer"));
		royal.printPatients();
		System.out.println("The number of patients in this hospital is: " + royal.getCount());

		//Patient patient2 = new Patient("Jake", 32, "large case of boils");
		//patient1.addPatient(patient2);
		//patient1.printPatient();
		//patient1.deletePatient(patient1,"Graeme");
		//System.out.println("Deleting 'Graeme'...");
		//patient1.printPatient();
	}

}