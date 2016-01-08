package Week7;
public class HospitalC
{

	private String name;
	private Patient head;
	private int count;

	public HospitalC(String name)
	{
		this.name = name;
		this.head = null;
		this.count = 0;
	}

	public void printPatients() 
	{
		Patient element = head;
		System.out.println("Patients of " + this.name);

		do{
			element.print();
			element = element.getNextPatient();
		}
		while (element != head);
	}

	public void addPatient(Patient patient) 
	{
		if (head == null) 
		{
			head = patient;
			head.setNextPatient(head);
		} 
		else 
		{
			Patient element = head;

			while (element.getNextPatient() != head) 
			{
				element = element.getNextPatient();
			}
			element.setNextPatient(patient);
			patient.setNextPatient(head);
		}
		this.count++;
	}

	public void deletePatientByName(String name)
	{
		if (head == null) {
			System.out.println("No patient named " + name + " found.");
			return;
		}

		if (head.getName().equals(name)) 
		{
			head = head.getNextPatient();
			System.out.println("Patient named " + name + " found and deleted.");
		} 
		else 
		{
			Patient element = head;
			Patient nextElement = element.getNextPatient();

			while (nextElement != head) 
			{
				if (nextElement.getName().equals(name)) 
				{
					System.out.println("Patient named " + name + " found and deleted.");
					element.setNextPatient(nextElement.getNextPatient());
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