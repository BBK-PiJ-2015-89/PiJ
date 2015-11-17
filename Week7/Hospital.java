public class Hospital
{

	private String name;
	private Patient head;

	public Hospital(String name)
	{
		this.name = name;
	}

	public void printPatients() 
	{
		Patient element = head;
		System.out.println("Patients of " + this.name);

		while (element != null) 
		{
			element.print();
			element = element.getNextPatient();
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
		}
	}

	public void deletePatientByName(String name)
	{
		if (head == null) {
			return;
		}

		if (head.getName().equals(name)) 
		{
			head = head.getNextPatient();
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
				}

				element = element.getNextPatient();
				nextElement = nextElement.getNextPatient();
			}
		}
	}

}