public class Patient
{
	private String name;
	private int age; 
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;

	public Patient(String name, int age, String illness)
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.prevPatient = null;
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

	public Patient getPrevPatient() 
	{
		return this.prevPatient;
	}

	public void setNextPatient(Patient patient) 
	{
		this.nextPatient = patient;
	}
	public void setPrevPatient(Patient patient) 
	{
		this.prevPatient = patient;
	}

}