public class HospitalDBL
{

	private String name;
	private PatientDBL head;
	private int count;
	private PatientDBL tail;

	public HospitalDBL(String name)
	{
		this.name = name;
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	public void printPatients() 
	{
		PatientDBL element = head;
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

	public void addPatient(PatientDBL patientDBL) 
	{
		if (head == null) 
		{
			head = patientDBL;
			tail = patientDBL;
		} 
		else 
		{
			PatientDBL element = head;

			while (element.getNextPatient() != null) 
			{
				element = element.getNextPatient();
			}
			element.setNextPatient(patientDBL);
			patientDBL.setPrevPatient(element);
			tail = patientDBL;
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
			PatientDBL element = head;
			PatientDBL nextElement = element.getNextPatient();

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