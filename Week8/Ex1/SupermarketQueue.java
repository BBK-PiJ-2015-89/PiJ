public class SupermarketQueue implements PersonQueue 
{
    private Person head;
    private String name;

    public SupermarketQueue(String name)
    {
    	this.head = null;
    	this.name = name;
    }

    public void insert(Person person)
    {
		if (head == null) 
		{
			head = person;
		} 
		else 
		{
			Person element = head;

			while (element.getNextPerson() != null) 
			{
				element = element.getNextPerson();
			}
			element.setNextPerson(person);
		}
    } 

    public void retrieve()
    {
    	if (head == null) {
			System.out.println("No one is in the queue, take a break!");
			return;
		}
		else if (head.getNextPerson() == null)
		{
			System.out.println("Serving " + head.getName() + " no more customers in the queue");
			head = null;
		}
		else 
		{
			Person element = head;
			Person nextElement = element.getNextPerson();

			while (nextElement.getNextPerson() != null) 
			{
				element = element.getNextPerson();
				nextElement = nextElement.getNextPerson();
			}
			System.out.println("Serving " + nextElement.getName() + " more persons to follow");
			element.setNextPerson(nextElement.getNextPerson());
		}
	}	
}