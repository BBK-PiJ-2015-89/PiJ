package Week7;
public class IntList
{
	private String name;
	private IntValue head;

	public IntList(String name)
	{
		this.name = name;
		this.head = null;
	}

	public void arraySetter(int [] name)
	{
	for (int i=0; i<name.length; i++)
	{
		this.addValue(new IntValue(name[i]));
	}
	}
	

	public void printValue() 
	{
		IntValue element = head;
		System.out.println("Values in: " + this.name);

		while (element != null) 
		{
			element.print();
			element = element.getNextValue();
		}
	}

	public void addValue(IntValue number) 
	{
		if (head == null) 
		{
			head = number;
		} 
		else 
		{
			IntValue element = head;

			while (element.getNextValue() != null) 
			{
				element = element.getNextValue();
			}
			element.setNextValue(number);
		}
	}
}