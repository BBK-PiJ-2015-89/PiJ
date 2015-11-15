public class Spy {
	private static int spyCount = 0;
	private int ID;

	public Spy(int id)
	{
		this.ID = id;
		spyCount++;
		System.out.println("Spy ID: " + this.ID);
		System.out.println("Spies Count: " + spyCount);		
	}
	
	public void die()
	{
		System.out.println("Spy " + ID + " has been found and deleted");
		spyCount--;
		System.out.println("Count of Spies: " + spyCount);
	}
	public static void main(String[] args) {
		Spy spy1 = new Spy(1007);
		Spy spy2 = new Spy(1002);
		Spy spy3 = new Spy(102);
		spy3.die();
		Spy spy4 = new Spy(1003);
		spy2.die();
		spy1.die();
		Spy spy5 = new Spy(1078);
	}
}