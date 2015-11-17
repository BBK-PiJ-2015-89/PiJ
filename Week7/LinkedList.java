public class LinkedList{
	Patients patient;
	Patients nextPatient;

	public void addPatient(String n, int a, String illness){
		if(patient == null)
		{
			patient = Patients(n,a,illness);
		}
		else 
		{
			this.nextPatient.addPatient(n, a, illness);
		}
	}
	}
}