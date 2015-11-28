public class SupermarketQueue implements PersonQueue 
{
    private Person head;

    public SupermarketQueue()
    {
    	this.head = null;
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

    public Person retrieve()
    {
    	if (this.head == null)
    	{
    		return null;
    	}
    	else
    	{
    		Person temp = this.head;
    		this.head = this.head.getNextPerson();
    		return temp;
    	}
	}	
}