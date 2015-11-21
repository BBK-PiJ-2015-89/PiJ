public class HospitalDBL
{

	private String name;
	private PatientDBL head;
	private int count;

	public HospitalDBL(String name)
	{
		this.name = name;
		this.head = null;
		this.count = 0;
	}

	public void printPatients() 
	{
		PatientDBL element = head;
		System.out.println("Patients of " + this.name);

		while (element != null) 
		{
			System.out.println("Patients in order: ");
			element.print();
			element = element.getNextPatient();
		}

		element = head;
		while(element.getNextPatient()!=null)
		{
			element = element.getNextPatient();
		}
		while (element.getPrevPatient() != null) 
		{
			System.out.println("Patients in reverse: ");
			element.print();
			element = element.getPrevPatient();
		}
	}

	public void addPatient(PatientDBL patientDBL) 
	{
		if (head == null) 
		{
			head = patientDBL;
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