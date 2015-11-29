public class TreeIntList implements IntSet{

	private ListItem head;

	public TreeIntList(int n)
	{
		ListItem newItem = new ListItem(n);
		head = newItem;
	}
	
	public void add (int n){

	ListItem newItem = new ListItem(n);
	
	if (head == null) 
		{
			head = newItem;
		} 
		else 
		{
		 ListItem element = head;

			while (element.getNext() != null) 
			{
				if (element.getValue()==n || element.getNext().getValue()==n)
				{
					return;
				}
				else
				{
				element = element.getNext();
				}
			}
			element.setNext(newItem);
		}
	}

	public boolean contains(int n)
	{
		if (head.getValue()==n)
		{
			return true;
		}
			ListItem element = head;

			while (element.getNext() != null) 
			{
				if (element.getValue()==n) 
				{
					return true;
				}
				else
				{
					element = element.getNext();
				}
			}
			return false;
	}
	public boolean containsVerbose(int n)
	{
		if (head.getValue()==n)
		{
			return true;
		}
			ListItem element = head;

			while (element.getNext() != null) 
			{
				System.out.println(element.getValue());
				if (element.getValue()==n) 
				{
					return true;
				}
				else
				{
					element = element.getNext();
				}
			}
			return false;
	}

	public String toString()
	{
		if(head==null)
		{
			return "nothing is in the list";
		}
		else if (head.getNext()==null)
		{
			return Integer.toString(head.getValue());
		}
		else
		{
			String tempStr = "";
			ListItem temphead = head;

			while (temphead!=null)
			{
				tempStr += Integer.toString(temphead.getValue())+", ";
				temphead = temphead.getNext();
			}
			return tempStr;
		}
	}
}