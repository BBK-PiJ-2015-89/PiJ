public class DoWhile
{
	public static void main(String[] Args)
	{
		String s;
		int mark;
		int invalid = 0;
		int distinction = 0;
		int passes = 0;
		int fails = 0;

		do
		{
			System.out.println("Enter the marks. Finish by entering -1");
			s = System.console().readLine();
			mark = Integer.parseInt(s);

			if (mark>100 || mark<-1)
			{
				invalid++;
			}
			else if (mark>69)
			{
				distinction++;
			}
			else if (mark>49)
			{
				passes++;
			}
			else if (mark!=-1)
			{
				fails++;
			}
		}while (mark != -1);

		System.out.println("There are " + (invalid + distinction + passes + fails) +
		" students: " + distinction + " distinctions, " + passes + " passes, " +
		fails + " fails (plus " + invalid + " invalid).");
	}
}