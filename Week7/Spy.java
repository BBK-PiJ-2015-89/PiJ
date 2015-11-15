public class Spy
{
	private static int spyCount = 0;

	public static void main(String[] args)
	{
		
		spy(spyID);

	}

	public Spy(int spyID)
	{
		spyCount++;
		System.out.println("The spy ID is " + spyID + " and the total number of spies is " + getNumberOfSpies());

	}
	public static int getNumberOfSpies();
	{
		return spyCount;
	}
}