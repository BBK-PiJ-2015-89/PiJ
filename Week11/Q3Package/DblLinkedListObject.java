package Week11.Q3Package;

public class DblLinkedListObject
{
	private String name;
	private int age; 
	private String illness;
	private DblLinkedListObject nextPatient;
	private DblLinkedListObject prevPatient;

	public DblLinkedListObject(String name, int age, String illness)
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

	public DblLinkedListObject getNextPatient()
	{
		return this.nextPatient;
	}

	public DblLinkedListObject getPrevPatient()
	{
		return this.prevPatient;
	}

	public void setNextPatient(DblLinkedListObject patientDBL)
	{
		this.nextPatient = patientDBL;
	}
	public void setPrevPatient(DblLinkedListObject patientDBL)
	{
		this.prevPatient = patientDBL;
	}

}