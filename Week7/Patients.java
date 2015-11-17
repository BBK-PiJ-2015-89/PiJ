public class Patients
{
	private String name;
	private int age; 
	private String illness;

	public Patients(String n, int a, String i){
		this.name = n;
		this.age = a;
		this.illness = i;

	public String getDetails(){
		return this.name + ", " + this.age + ", " + this.illness;
	}
	public String getName(){
		return this.name;
	}
}