public class MyscriptforMatrix
{
	public static void main(String[] args)
	{
		Matrix c = new Matrix(); 
		c.createMatrix(3,3);
		c.setElement(0,1,8);
		System.out.println(c.toString());
		c.prettyPrint();
		c.setRow(0,"9,3,5");
		System.out.println(c.toString());
		c.prettyPrint();
	}	
}