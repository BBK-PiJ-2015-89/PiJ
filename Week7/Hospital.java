public class Hospital
{
public static void main(String[] args)
	{
		Patient patient1 = new Patient("Graeme", 12, "Rabies");
		patient1.addPatient(new Patient("Dan", 22, "Flu"));
		patient1.addPatient(new Patient("Phil", 21, "Broken leg"));
		patient1.addPatient(new Patient("Mark", 17, "Tummy bug"));
		patient1.addPatient(new Patient("Jess", 17, "Tummy bug"));
		patient1.addPatient(new Patient("Alice", 17, "Tummy bug"));
		patient1.addPatient(new Patient("Harry", 17, "Tummy bug"));
		patient1.addPatient(new Patient("Sparky", 17, "Tummy bug"));
		patient1.addPatient(new Patient("Fluffy", 17, "Tummy bug"));
		patient1.addPatient(new Patient("Samuel", 17, "Tummy bug"));
		patient1.addPatient(new Patient("Terry", 17, "Tummy bug"));
		patient1.addPatient(new Patient("Simon", 17, "Tummy bug"));
		//Patient patient2 = new Patient("Jake", 32, "large case of boils");
		//patient1.addPatient(patient2);
		patient1.printPatient();
		patient1.deletePatient("Simon");
		patient1.printPatient();
	}
}