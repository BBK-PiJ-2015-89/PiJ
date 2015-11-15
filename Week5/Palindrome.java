public class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println("This programme can check if you enter a Palindrome");
		Palindrome p = new Palindrome();
		System.out.println("Please enter a word or sentance below which you think might be one, we'll tell you if it is or not.");
		String entered = System.console().readLine();
		String converted = p.reverse(entered);
		if(entered.equals(converted))
		{
			System.out.println("Your word/sentance was a Palindrome!");
		}
		else
		{
			System.out.println("Your word/sentance was not a Palindrome!");
		}
	}

	public String reverse (String ent)
	{
		int length = ent.length();
		int i = length - 1;
		if (length==0||length==1)
			{
				return ent;
			}
		String reverse = rev(ent, i);
		return reverse;

	}

	String temp ="";
	public String rev (String ent, int i)
	{

		if (i<0){
			return temp;
		}
		temp = temp + ent.charAt(i);
		rev(ent, i-1);
		return temp;
	}
}

