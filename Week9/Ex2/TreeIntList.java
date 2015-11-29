public class TreeIntList implements IntSet{

	private ListItem head;

	
	public void add (int n){

	publicListItem newItem = new ListItem(n);
	
	if (head == null) 
		{
			head = newItem;
		} 
		else 
		{
		 ListItem element = head;

			while (element.getNextPatient() != null) 
			{
				if (element.getValue().equals(n) || element.getNext().getValue().equals(n))
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
		if (head.getValue().equals(n))
		{
			return true;
		}
			ListItem element = head;

			while (element.getNext() != null) 
			{
				if (element.getValue().equals(n)) 
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


}
