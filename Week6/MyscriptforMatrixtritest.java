public class MyscriptforMatrixtritest
{
	public static void main(String[] args)
	{
		Matrix c = new Matrix(); 
		c.createMatrix(4,4);
		c.setColumn(3,"1,7,8,8");
		System.out.println(c.toString());
		c.prettyPrint();
		c.isSymmetrical();
		c.isTriangular();

	}	
}