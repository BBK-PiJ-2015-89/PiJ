public class PowerRecur
{

	public static void main(String[] args)
	{
		System.out.println("2 to the power of 5");
		PowerRecur p = new PowerRecur();
		int result = p.pow(2,5);

		System.out.println(result);
	}

	public int pow (int b, int e)
	{
		if (e<1)
		{
			return b;
		}
		else
		{
			return b*pow(b, e-1);
		}
		
	}
}