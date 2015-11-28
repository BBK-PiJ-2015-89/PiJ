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
    	System.out.println("Call");
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

			while (head.getNextPerson() != null) 
			{
				System.out.println("Serving "+head.getName() + " more persons to follow");
				//head.setNextPerson(nextElement.getNextPerson());
				head = head.getNextPerson();
			}
			System.out.println("Serving " + head.getName() + " No more persons to follow");
			
		}
	}	
}