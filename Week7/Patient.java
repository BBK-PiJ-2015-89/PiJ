public class Patient
{
	private String name;
	private int age; 
	private String illness;
	private Patient nextPatient;

	public static void main(String[] args)
	{
		Patient patient1 = new Patient("Graeme", 12, "Rabies");
		patient1.addPatient(new Patient("Dan", 22, "Flu"));
		patient1.addPatient(new Patient("Phil", 21, "Broken leg"));
		patient1.addPatient(new Patient("Mark", 17, "Tummy bug"));
		Patient patient2 = new Patient("Jake", 32, "large case of boils");
		patient1.addPatient(patient2);
		patient1.printPatient();
		patient1.deletePatient(name);
		patient1.printPatient();

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

	public boolean deletePatient(String name)
	{
		if(this.nextPatient == null)
		{
			return false;
		}
		else if(this.nextPatient.name.equals(name))
		{
			this.nextPatient = nextPatient.nextPatient;
			return true;
		}
		else
		{
			return this.nextPatient.deletePatient(patient);
		}
	}

	public void printPatient()
	{
	
		
			System.out.println(this.name + ", " + this.age + ", " + this.illness);
		
		if(this.nextPatient != null)
		{
			this.nextPatient.printPatient();
		}

	}

}