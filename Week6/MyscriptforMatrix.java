public class MyscriptforMatrix
{
	public static void main(String[] args)
	{
		Matrix c = new Matrix(); 
		c.createMatrix(3,3);
		c.setElement(0,1,8);// set second element to 8
		System.out.println(c.toString());
		c.prettyPrint();
		c.setRow(1,"1,1,1"); //set the 2nd row to 29,3,5.
		System.out.println(c.toString());
		c.prettyPrint();
		c.setColumn(1,"18,3,5"); //set the 2nd row to 29,3,5.
		System.out.println(c.toString());
		c.prettyPrint();
		c.isTriangular();

	}	
}