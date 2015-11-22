public class ListUtilities
{
	
	public static void main(String[] args)
	{
		IntList uch = new IntList("List One");
		uch.addValue(new IntValue(1));
		
		IntList arraytype = new IntList("Array List");
		int[] a = {1,3,5,7,8,10,28,76,102,101,65,72};
		arraytype.arraySetter(a);
		uch.printValue();
		arraytype.printValue();
	}
	
}