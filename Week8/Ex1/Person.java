public class Person
{
	private String name;
	private Person nextPerson;

	public Person(String name)
	{
		this.name = name;
		this.nextPerson = null;
	}	

	public void print()
	{
		System.out.println("Name: " + this.name);
	}

	public String getName() 
	{
		return this.name;
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