package Week11.Q3Package;

public class DblLinkedListObject<T>
{
	private T value;
	private DblLinkedListObject nextPatient;
	private DblLinkedListObject prevPatient;

	public DblLinkedListObject(T value)
	{
		this.value = value;
		this.nextPatient = null;
		this.prevPatient = null;
	}	

	public void print()
	{
		System.out.println(this.value);
	}

	public T getValue()
	{
		return this.value;
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