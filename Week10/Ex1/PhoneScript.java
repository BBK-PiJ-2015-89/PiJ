package Week10.Ex1;

public class PhoneScript
{
	public static void main (String[] args)
	{
		PhoneScript script = new PhoneScript();
		script.launch();
	}

	public void launch()
	{
		SmartPhone a = new SmartPhone();

		a.call("077924027651");
		a.call("077924027652");
		a.call("077924027653");
		a.call("077924027654");
		a.call("077924027655");
		a.call("077924027656");
		a.call("077924027657");
		a.call("077924027658");
		a.call("077924027659");
		a.call("0779240276510");
		a.call("0779240276511");
		a.ringAlarm("Morning 10am");
		a.browseWeb("www.google.co.uk");
		System.out.println(a.findPosition());
		a.printLastNumbers();
	}
}