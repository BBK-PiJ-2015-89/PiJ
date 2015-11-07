public class Powerloop
{

	public static void main(String[] args)
	{
		System.out.println("2 to the power of 16");
		Powerloop p = new Powerloop();
		int result = p.pow(2,8);
		System.out.println(result);
	}

	public int pow (int b, int e)
	{
		int ans = b;
		for (int i=e; i>0; i--)
		{
		ans =  ans * b;
		}
		return ans;
	}
}