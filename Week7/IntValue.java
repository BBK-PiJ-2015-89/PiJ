package Week7;
public class IntValue
{
	private int value;
	private IntValue next;

	public IntValue (int number)
	{
		this.value = number;
		this.next = null;
	}
	public void print()
	{
		System.out.println(this.value);
	}

	public int getValue() 
	{
		return this.value;
	}

	public IntValue getNextValue() 
	{
		return this.next;
	}

	public void setNextValue(IntValue number) 
	{
		this.next = number;
	}

}