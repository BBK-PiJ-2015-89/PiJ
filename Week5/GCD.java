public class GCD
{
	public static void main(String[] args)
	{
		GCD g = new GCD();
		System.out.println("Hello, this programme will tell us the GCD of two numbers:");
		int a = 70;
		int b = 73157;
		int i = a;
		int s = g.gcd(i,a,b);
		System.out.println(s);

	}

	public int gcd (int i, int a, int b)
	{
		if (a%i==0 && b%i==0)
		{
			return i;
		}
		else
		{
			return gcd(i-1, a, b);
		}
	}
}