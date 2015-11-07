public class GCD
{
	public static void main(String[] args)
	{
		GCD g = new GCD();
		System.out.println("Hello, this programme will tell us the two numbers:");
		int a = 16;
		int b = 3;
		int i = 0;
		g.s = 0;
		g.gcd(i,a,b);
		System.out.println(g.s);

	}

		public void gcd (int i, int a, int b)
		{
			if (a>b && a%b==0)
			{
				s = b;
			}
			else if (b>a && b%a==0)
			{
				s = a;
			}
			else if (a>b)
			{
				i = b;
				recgcd(i, a, b);
			}
			else
			{
				i = a;
				recgcd(i, a, b);
			}
		}

int s = 0;
		public void recgcd (int i, int a, int b)
		{
			if (i<2)
			{
				s=i;
			}
			else
			{
			int sum1 = a%i;
			int sum2 = b%i;
			if (sum1==0 && sum2==0)
			{
				s = i;
			}
			else
			{
				recgcd(i-1, a, b);
			}
				
		}
	}
}