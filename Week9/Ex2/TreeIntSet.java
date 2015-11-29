public class TreeIntSet implements TreeIntSet{

	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public void add (int newNumber)
	{
		if (newNumber > this.value && newNumber!=this.value)
		{
			if (right == null)
			{
				right = new IntegerTreeNode(newNumber);
			}
			else 
			{
				right.add(newNumber);
			}
		}
		else
		{
			if (left == null && newNumber!=this.value)
			{
				left = new IntegerTreeNode(newNumber);
			}
			else
			{
				left.add(newNumber);
			}
		}
}