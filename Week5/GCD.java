public class GCD
{
	public static void main(String[] args)
	{
		GCD g = new GCD();
		System.out.println("Hello, this programme will tell us the two numbers:");
		int a = 10;
		int b = 8;
		int i = 0;
		int s = 0;
		int sum = g.gcd(s, i,a,b);
		System.out.println(sum);

	}

	public int gcd (int s, int i, int a, int b)
	{
		if (a>b && a%b==0)
		{
			return b;
		}
		else if (b>a && b%a==0)
		{
			return a;
		}
		else if (a>b){
			i = b;
		}
		else
		{
			i = a;
		}

	int result = recgcd(s, i, a, b);
	return result;
	}

	public int recgcd (int s, int i, int a, int b)
	{
		if (i<1)
		{
			return i;
		}
		int sum1 = a%i;
		int sum2 = b%i;
		if (sum1==0 && sum2==0)
		{
			s = i;
		}
		recgcd(s, i-1, a, b);
		return s;
	}
}