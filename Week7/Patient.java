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

	public void print()
	{
		System.out.println(this.name + ", " + this.age + ", " + this.illness);
	}

	public String getName() 
	{
		return this.name;
	}

	public Patient getNextPatient() 
	{
		return this.nextPatient;
	}

	public void setNextPatient(Patient patient) 
	{
		this.nextPatient = patient;
	}

}