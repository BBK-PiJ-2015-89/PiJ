public class KidPerson implements Person
{
	private int situation;
	private int energy;

	/*move a dinstance in a straight line, given in meters*/
	public void move (int distance)
	{
			run(distance);
	}

	/*Say something*/
	public void say (String message)
	{
		System.out.println(message);
	}

	private void run (int distance)
	{
		situation = situation + distance;
	}
	
	public KidPerson()
	{
		this.situation = 0;
		this.energy = 100;
	}
}