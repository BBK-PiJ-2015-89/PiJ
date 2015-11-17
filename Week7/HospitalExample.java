public class HospitalExample
{
	public static void main(String[] args)
	{
		Hospital uch = new Hospital("UCH Hospital");
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
		uch.deletePatientByName("Simon");
		uch.printPatients();

		Hospital royal = new Hospital("Royal Hospital");
		royal.addPatient(new Patient("Queen", 89, "Altzheimer"));
		royal.printPatients();

		//Patient patient2 = new Patient("Jake", 32, "large case of boils");
		//patient1.addPatient(patient2);
		//patient1.printPatient();
		//patient1.deletePatient(patient1,"Graeme");
		//System.out.println("Deleting 'Graeme'...");
		//patient1.printPatient();
	}

}