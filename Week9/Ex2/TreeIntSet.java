public class TreeIntSet implements IntSet{

	private int value;
	private TreeIntSet left;
	private TreeIntSet right;


public TreeIntSet(int n)
	{
		this.value = n;
		this.left = null;
		this.right = null;
	}

	public void add (int n)
	{
		if (n > this.value && n!=this.value)
		{
			if (right == null)
			{
				right = new TreeIntSet(n);
			}
			else 
			{
				right.add(n);
			}
		}
		else
		{
			if (left == null && n!=this.value)
			{
				left = new TreeIntSet(n);
			}
			else
			{
				left.add(n);
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
	public boolean containsVerbose(int n)
	{
		System.out.println(this.value);
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
				
				return right.containsVerbose(n);
			}
		}
		else
		{
			System.out.println(this.value);
			if (left == null)
			{
				return false;
			}
			else
			{
				return left.containsVerbose(n);
			}
		}
	}

	public String toString()
    {
    	String result;
    	result = "";
    	result = result  + Integer.toString(this.value) + ",";

    	if(this.left !=null)
    	{
    		result = result  + this.left.toString();
    	}
    	if(this.right !=null)
    	{
    		result = result  + this.right.toString();
    	}
    	return result;
    }
}