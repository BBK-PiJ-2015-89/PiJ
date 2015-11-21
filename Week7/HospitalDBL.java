public class Hospital
{

	private String name;
	private Patient head;
	private int count;

	public Hospital(String name)
	{
		this.name = name;
		this.head = null;
		this.count = 0;
	}

	public void printPatients() 
	{
		Patient element = head;
		System.out.println("Patients of " + this.name);

		while (element != null) 
		{
			System.out.println("Patients in order: ");
			element.print();
			element = element.getNextPatient();
		}

		Patient element = head;
		while(element.getNextPatient!=null)
		{
			element = element.getNextPatient
		}
		while (element.getPrevPatient() != null) 
		{
			System.out.println("Patients in reverse: ");
			element.print();
			element = element.getPrevPatient();
		}
	}

	public void addPatient(Patient patient) 
	{
		if (head == null) 
		{
			head = patient;
		} 
		else 
		{
			Patient element = head;

			while (element.getNextPatient() != null) 
			{
				element = element.getNextPatient();
			}
			element.setNextPatient(patient);
			patient.setPrevPatient(element);
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
			head.getPrevPatient() = null;
		} 
		else 
		{
			Patient element = head;
			Patient nextElement = element.getNextPatient();

			while (nextElement != null) 
			{
				if (nextElement.getName().equals(name)) 
				{
					element.setNextPatient(nextElement.getNextPatient());
					nextElement.getNextPatient().setPrevPatient(element);
					this.count--;
				}

				element = element.getNextPatient();
				nextElement = nextElement.getNextPatient();
			}
		}
	}

	public int getCount()
	{
		return this.count;
	}
}