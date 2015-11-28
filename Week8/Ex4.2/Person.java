public class Person
{
	private String name;
	private int age;
	private Person nextPerson;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		this.nextPerson = null;
	}	

	public void print()
	{
		System.out.println("Name: " + this.name + " Age: " + this.age);
	}

	public String getName() 
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}

	public Person getNextPerson() 
	{
		return this.nextPerson;
	}

	public void setNextPerson(Person person) 
	{
		this.nextPerson = person;
	}

}