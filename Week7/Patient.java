public class Patient
{
	private String name;
	private int age; 
	private String illness;
	private Patient nextPatient;

	public static void main(String[] args)
	{
		Patient patient1 = new Patient("Graeme", 12, "Rabies");
		System.out.println(patient1.name + ", " + patient1.age + ", " + patient1.illness);
		patient1.addPatient(new Patient("Dan", 22, "Flu"));
		patient1.addPatient(new Patient("Phil", 21, "Broken leg"));
		patient1.addPatient(new Patient("Mark", 17, "Tummy bug"));

		patient1.printList(patient1);

	}

	public Patient(String name, int age, String illness)
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}	

	public void addPatient(Patient newPatient)
	{
		if(this.nextPatient == null)
		{
			this.nextPatient = newPatient;
		}
		else
		{
			this.nextPatient.addPatient(newPatient);
		}
	}

	public boolean deletePatient(Patient patient)
	{
		if(this.nextPatient == null)
		{
			return false;
		}
		else if(this.nextPatient.name.equals(patient.name))
		{
			this.nextPatient = nextPatient.nextPatient;
			return true;
		}
		else
		{
			return this.nextPatient.deletePatient(patient);
		}
	}

	public void printList(Patient patient)
	{
		if(this.nextPatient == null)
		{
			System.out.println(patient.name + ", " + patient.age + ", " + patient.illness);
		}
		else if(this.nextPatient != null)
		{
			System.out.println(patient.name + ", " + patient.age + ", " + patient.illness);
			printList(patient.nextPatient);
		}

	}

}