public class SimpleMap implements SimpleMapInter
{
	private MapItem head = null;

	public void put(int key, String name)
	{
		if (head == null)
		{
		head = new MapItem(key, name);		
		}
		else 
		{
			MapItem temp = head;
			while (temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			temp.setNext(new MapItem(key, name));
		}
	}
	public String get (int key)
	{
		if (head == null)
		{
			return null;
		}
		else if (head.getKey()==key)
		{
			return head.getString();
		}
		else {
			MapItem element = head;
			MapItem nextElement = element.getNext();
			while (element.getNext() != null) 
			{
				if (element.getKey()==key) 
				{
					return element.getString();
				}
				element = element.getNext();
			}
			return null;
			
		}
	}

	public void remove (int key)
	{
		if (head == null)
		{
		}
		else if(key == head.getKey())
		{
			MapItem temp = head;
			head = head.getNext();
		}
		else
		{
			MapItem element = head;
			MapItem nextElement = element.getNext();

			while (element.getNext() != null) 
			{
				if (nextElement.getKey()==key) 
				{
					element.setNext(nextElement.getNext());
				}
				element = element.getNext();
			}
		}
	}

	public boolean isEmpty()
	{
		boolean temp = false;
		if (head == null)
		{
			temp = true; 
		}
		return temp;
	}

}