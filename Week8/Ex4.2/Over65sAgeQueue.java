public class Over65sAgeQueue implements PersonQueue 
{
    private Person head;

    public Over65sAgeQueue()
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
            if (person.getAge() > 65)
            {
                if (head.getAge()<65)
                {
                    person.setNextPerson(head);
                    head = person;
                }
                else
                {
                    Person temp = head;
                    while (temp.getNextPerson()!=null && temp.getNextPerson().getAge()>65)
                    {
                        temp = temp.getNextPerson();
                    }
                    if (temp.getNextPerson()== null)
                    {
                        temp.setNextPerson(person);  
                    }
                    else
                    {
                        person.setNextPerson(temp.getNextPerson());
                        temp.setNextPerson(person);
                    }
                    
                }
            }
            else if (person.getAge() > 18)
            {
                if (head.getAge()<18)
                {
                    person.setNextPerson(head);
                    head = person;
                }
                else
                {
                    Person temp = head;
                    while (temp.getNextPerson()!=null && temp.getNextPerson().getAge()>18)
                    {
                        temp = temp.getNextPerson();
                    }
                    if (temp.getNextPerson()== null)
                    {
                        temp.setNextPerson(person);  
                    }
                    else
                    {
                        person.setNextPerson(temp.getNextPerson());
                        temp.setNextPerson(person);
                    }
                }
            }
            else
            {
                Person temp = head;
                while (temp.getNextPerson() != null) 
                {
                    temp = temp.getNextPerson();
                }
                temp.setNextPerson(person); 
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