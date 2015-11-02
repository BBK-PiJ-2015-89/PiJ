public class Ex261script
{
	public static void main(String[] args)
	{
		int[] ids = new int[10];
		String[] names = new String[10];

		for(int i = 0; i<=9; i++)
		{
			System.out.print("Enter the employee name: ");
			String name = System.console().readLine();
			System.out.print("Enter the employee id: ");
			int id = Integer.parseInt(System.console().readLine());
			ids[i]=id;
			names[i]=name;
		}
		System.out.println("Employees with ID's less than 1000");
		for(int i = 0; i<=9; i++)
		{
			if(ids[i]<1000)
			{
				System.out.println(ids[i] + ", " + names[i]);
			}
		}
		System.out.println("Employees starting with S or J");
		for(int i = 0; i<=9; i++)
		{
			if(names[i].charAt(0)=='S' || names[i].charAt(0)=='J')
			{
				
				System.out.println(ids[i] + ", " + names[i]);
			}
		}
	}
}