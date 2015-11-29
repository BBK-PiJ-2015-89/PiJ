public class ListItem {
	
	private int value;
	private ListItem next;

	public ListItem (int n)
	{
		this.value = n;
		this.next = null;
	}

	public void print()
	{
		System.out.println(this.value);
	}

	public String getValue() 
	{
		return this.value;
	}

	public Patient getNext() 
	{
		return this.next;
	}

	public void setNext(ListItem item) 
	{
		this.next = item;
	}
}