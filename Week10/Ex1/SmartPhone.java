package Week10.Ex1;
public class SmartPhone extends Week11.MobilePhone {

	public void browseWeb(String s)
	{
		System.out.println("Finding page: " + s);
	}

	public String findPosition()
	{
		return "Your posiiton is: 123,456";
	}
}