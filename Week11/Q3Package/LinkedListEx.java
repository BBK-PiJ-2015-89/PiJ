package Week11.Q3Package;


public class LinkedListEx<T>
{

	private String name;
	private DblLinkedListObject<T> head;
	private int count;
	private DblLinkedListObject<T> tail;

	public LinkedListEx(String name)
	{
		this.name = name;
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	public void printPatients() 
	{
		DblLinkedListObject<T> element = head;
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

	public void addPatient(DblLinkedListObject<T> dblLinkedListObject)
	{
		if (head == null) 
		{
			head = dblLinkedListObject;
			tail = dblLinkedListObject;
		} 
		else 
		{
			DblLinkedListObject<T> element = head;

			while (element.getNextPatient() != null) 
			{
				element = element.getNextPatient();
			}
			element.setNextPatient(dblLinkedListObject);
			dblLinkedListObject.setPrevPatient(element);
			tail = dblLinkedListObject;
		}
		this.count++;
	}

	public void deletePatientByName(String name)
	{
		if (head == null) {
			return;
		}

		if (head.getValue().equals(name))
		{
			head = head.getNextPatient();
			head.setPrevPatient(null);
			this.count--;
		} 
		else 
		{
			DblLinkedListObject<T> element = head;
			DblLinkedListObject<T> nextElement = element.getNextPatient();

			while (nextElement != null) 
			{
				if (nextElement.getValue().equals(name))
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
		if (tail.getValue().equals(name))
		{
			tail = tail.getPrevPatient();
		}
	}

	public int getCount()
	{
		return this.count;
	}
}