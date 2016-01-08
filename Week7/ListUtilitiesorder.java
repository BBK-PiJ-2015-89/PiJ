package Week7;
public class ListUtilitiesorder
{
	
	public static void main(String[] args)
	{
		IntListorder uch = new IntListorder("List One");
		uch.addValue(new IntValue(1));
		
		IntListorder arraytype = new IntListorder("Array List");
		int[] a = {2,1,5,7,8,10,28,76,102,101,65,72};
		arraytype.arraySetter(a);
		uch.printValue();
		arraytype.printValue();
	}
	
}