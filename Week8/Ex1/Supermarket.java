public class Supermarket{

	private String name = null;
	private PersonQueue queue1 = new SupermarketQueue();

	public Supermarket(String name){
		this.name = name;
	}

	public void addPerson(Person person)
	{
		this.queue1.insert(person);
	}

	public Person servePerson()
	{
		Person temp = this.queue1.retrieve();
		if (temp!=null)
		{
			temp.print();
		}
		else
		{
			System.out.println("The queue is empty!");
		}
		return temp;
	}
}