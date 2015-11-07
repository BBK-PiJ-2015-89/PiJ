public class PowerRecur
{

	public static void main(String[] args)
	{
		System.out.println("2 to the power of 16");
		PowerRecur p = new PowerRecur();
		int result = p.pow(2,8);

		System.out.println(result);
	}
int ans = 2;
	public int pow (int b, int e)
	{
		if (e<1)
		{
			return ans;
		}
		ans =  ans * b;
		pow(b, e-1);
		return ans;
	}
}