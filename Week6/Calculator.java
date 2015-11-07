public class Calculator
{
	public int add(int d1, int d2)
	{
		int answer = d1+d2;
		return answer;
	}

	public int subtract(int d1, int d2)
	{
		int answer = d1-d2;
		return answer;
	}

	public int multiply(int d1, int d2)
	{
		int answer = d1*d2;
		return answer;
	}

	public double divide(int d1, int d2)
	{
		double answer = ((double)d1)/((double)d2);
		return answer;
	}
	
	public int modulus(int d1, int d2)
	{
		int answer = d1%d2;
		return answer;
	}

}