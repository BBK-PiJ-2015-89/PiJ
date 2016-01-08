package Week10.Ex2;
import java.util.ArrayList;
public class MobilePhone extends Week11.OldPhone {

	ArrayList<String> numbers = new ArrayList<String>();

	public void ringAlarm(String s)
	{
		System.out.println("Alarm: " + s);
	}

	public void playGame(String s)
	{
		System.out.println("Thanks for playing " + s + "you lost");
	}

	public void call (String number){
		super.call(number);
		numbers.add(number);
		if (numbers.size() > 10)
		{
			numbers.remove(0);
		}
	}
	public void printLastNumbers()
	{
		for (int i = 0; i<numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}
	}
}