package Week11.Q2Package;

public class SmartPhone extends MobilePhone {

	public void browseWeb(String s)
	{
		System.out.println("Finding page: " + s);
	}

	public String findPosition()
	{
		return "Your posiiton is: 123,456";
	}
}