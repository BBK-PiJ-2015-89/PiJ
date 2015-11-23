public class IntegerTreeNode implements IntegerTree
{
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int value)
	{
		this.value = value;
		this.left = null;
		this.right = null;
	}
	public void add (int newNumber)
	{
		if (newNumber > this.value)
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
			if (left == null)
			{
				left = new IntegerTreeNode(newNumber);
			}
			else
			{
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n)
	{
		if (n == this.value)
		{
			return true;
		}
		else if (n > this.value)
		{
			if (right == null)
			{
				return false;
			}
			else
			{
				return right.contains(n);
			}
		}
		else
		{
			if (left == null)
			{
				return false;
			}
			else
			{
				return left.contains(n);
			}
		}
	}
	public int getMax()
	{
		if (this.right == null)
		{
			return this.value;
		}
		else
		{
			return this.right.getMax();
		}
	}
	public int getMin()
	{
		if (this.left == null)
		{
			return this.value;
		}
		else
		{
			return this.left.getMin();

		}
	}
	public int depth() {
		int leftdepth = 0;
		if(left != null) {
			leftdepth = left.depth();
		}
		int rightdepth = 0;
		if(right != null) {
			rightdepth = right.depth();
		}
		if(leftdepth > rightdepth) {
			return 1 + leftdepth;
		} else {
			return 1 + rightdepth;
		}
	}
}
