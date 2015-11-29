public class MapItem{
	
	private int key;
	private String str;
	private MapItem next;

	public MapItem(int key, String str)
	{
		this.key = key;
		this.str = str;
		next = null;
	}

	public int getKey()
	{
		return this.key;
	}

	public String getString()
	{
		return this.str;
	}

	public void setNext(MapItem mapnew)
	{
		this.next = mapnew;
	}

	public MapItem getNext()
	{
		return next;
	}
}