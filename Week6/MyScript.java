public class MyScript
{
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		int sum = c.add(12,34);
		System.out.println(sum);

		sum = c.subtract(12,34);
		System.out.println(sum);

		sum = c.multiply(12,34);
		System.out.println(sum);

		double sum2 = c.divide(4,2);
		System.out.println(sum2);

		sum = c.subtract(12,34);
		System.out.println(sum);

		sum = c.modulus(4,3);
		System.out.println(sum);
	}

}