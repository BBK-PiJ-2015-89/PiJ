public class HospitalExampleDBL
{
	public static void main(String[] args)
	{
		HospitalDBL uch = new HospitalDBL("UCH HospitalDBL");
		uch.addPatient(new PatientDBL("Graeme", 12, "Rabies"));
		uch.addPatient(new PatientDBL("Dan", 22, "Flu"));
		uch.addPatient(new PatientDBL("Phil", 21, "Broken leg"));
		uch.addPatient(new PatientDBL("Mark", 17, "Tummy bug"));
		uch.addPatient(new PatientDBL("Jess", 17, "Tummy bug"));
		uch.addPatient(new PatientDBL("Alice", 17, "Tummy bug"));
		uch.addPatient(new PatientDBL("Harry", 17, "Tummy bug"));
		uch.addPatient(new PatientDBL("Sparky", 17, "Tummy bug"));
		uch.addPatient(new PatientDBL("Fluffy", 17, "Tummy bug"));
		uch.addPatient(new PatientDBL("Samuel", 17, "Tummy bug"));
		uch.addPatient(new PatientDBL("Terry", 17, "Tummy bug"));
		uch.addPatient(new PatientDBL("Simon", 17, "Tummy bug"));
		System.out.println("The number of patients in this hospital is: " + uch.getCount());
		uch.deletePatientByName("Simon");
		uch.printPatients();
		System.out.println("The number of patients in this hospital is: " + uch.getCount());

		HospitalDBL royal = new HospitalDBL("Royal HospitalDBL");
		royal.addPatient(new PatientDBL("Queen", 89, "Altzheimer"));
		royal.addPatient(new PatientDBL("Simon", 17, "Tummy bug"));
		royal.printPatients();
		System.out.println("The number of patients in this hospital is: " + royal.getCount());

		//PatientDBL patient2 = new Patient("Jake", 32, "large case of boils");
		//patient1.addPatient(patient2);
		//patient1.printPatient();
		//patient1.deletePatient(patient1,"Graeme");
		//System.out.println("Deleting 'Graeme'...");
		//patient1.printPatient();
	}

}