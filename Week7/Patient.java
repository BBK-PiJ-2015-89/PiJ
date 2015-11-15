public class Patient
{
	private String name;
	private int age; 
	private String illness;
	private Patient nextPatient;

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
			return this.nextPatient.deletePatient(name);
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