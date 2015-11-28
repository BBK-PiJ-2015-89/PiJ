public class AgeQueue implements PersonQueue 
{
    private Person head;

    public AgeQueue()
    {
    	head = null;
   	}

    public void insert(Person person)
    {
		if (head == null) 
		{
			head = person;
		} 
		else 
		{
            if (person.getAge()>head.getAge())
            {
                person.setNextPerson(head);
                head = person;
            }
            else
            {
			Person element = head;
            while (element.getNextPerson()!=null && person.getAge()<element.getNextPerson().getAge())
            {
                element = element.getNextPerson();
            }
            if (element.getNextPerson()==null)
            {
                element.setNextPerson(person);
            }
            else
            {
                person.setNextPerson(element.getNextPerson());
                element.setNextPerson(person);
            }
        }
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