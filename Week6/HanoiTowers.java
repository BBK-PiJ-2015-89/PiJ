public class HanoiTowers
{

	public static void main(String[] args)
	{
		HanoiTowers ht = new HanoiTowers();
		int sum=ht.hanoi(5);
		System.out.println(sum);
	}
	public int hanoi(int n)
	{
		if (n<0)
		{
			return -1;
		}
		else if (n==1)
		{
			return 1;
		}
		else 
		{
			return 1 + 2*hanoi(n-1);
		}
	}
}