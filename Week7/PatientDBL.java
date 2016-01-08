package Week7;

public class PatientDBL
{
	private String name;
	private int age; 
	private String illness;
	private PatientDBL nextPatient;
	private PatientDBL prevPatient;

	public PatientDBL(String name, int age, String illness)
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

	public PatientDBL getNextPatient() 
	{
		return this.nextPatient;
	}

	public PatientDBL getPrevPatient() 
	{
		return this.prevPatient;
	}

	public void setNextPatient(PatientDBL patientDBL) 
	{
		this.nextPatient = patientDBL;
	}
	public void setPrevPatient(PatientDBL patientDBL) 
	{
		this.prevPatient = patientDBL;
	}

}