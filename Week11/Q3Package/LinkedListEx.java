package Week11.Q3Package;


public class LinkedListEx
{

	private String name;
	private DblLinkedListObject head;
	private int count;
	private DblLinkedListObject tail;

	public LinkedListEx(String name)
	{
		this.name = name;
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	public void printPatients() 
	{
		DblLinkedListObject element = head;
		System.out.println("Patients of " + this.name);
		System.out.println("Patients in order: ");
		while (element != null) 
		{
			element.print();
			element = element.getNextPatient();
		}

		element = tail;
		
		System.out.println("Patients in reverse: ");
		while (element != null) 
		{
			element.print();
			element = element.getPrevPatient();
		}
	}

	public void addPatient(DblLinkedListObject DblLinkedListObject)
	{
		if (head == null) 
		{
			head = DblLinkedListObject;
			tail = DblLinkedListObject;
		} 
		else 
		{
			DblLinkedListObject element = head;

			while (element.getNextPatient() != null) 
			{
				element = element.getNextPatient();
			}
			element.setNextPatient(DblLinkedListObject);
			DblLinkedListObject.setPrevPatient(element);
			tail = DblLinkedListObject;
		}
		this.count++;
	}

	public void deletePatientByName(String name)
	{
		if (head == null) {
			return;
		}

		if (head.getName().equals(name)) 
		{
			head = head.getNextPatient();
			head.setPrevPatient(null);
			this.count--;
		} 
		else 
		{
			DblLinkedListObject element = head;
			DblLinkedListObject nextElement = element.getNextPatient();

			while (nextElement != null) 
			{
				if (nextElement.getName().equals(name)) 
				{
					element.setNextPatient(nextElement.getNextPatient());
					if (nextElement.getNextPatient() != null)
					{
					nextElement.getNextPatient().setPrevPatient(element);
					}
					this.count--;
				}

				element = element.getNextPatient();
				nextElement = nextElement.getNextPatient();
			}
		}
		if (tail.getName().equals(name))
		{
			tail = tail.getPrevPatient();
		}
	}

	public int getCount()
	{
		return this.count;
	}
}