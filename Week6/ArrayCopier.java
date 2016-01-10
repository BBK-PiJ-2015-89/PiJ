package Week6;
public class ArrayCopier
{
	public static void main(String[] args)
	{
		ArrayCopier cop = new ArrayCopier();
		int[] a = {1,3,5};
		int[] b = {1,2,3,4,5};
		int[] c = {7,8,9,4,8};

		cop.copier(a,b);
		cop.copier(c,b);
		cop.copier(b,a);


	}

	public void copier(int[] src, int[]dst)
	{
		if(src.length==dst.length)
		{
			System.out.println("Copying same length array over");
			for(int i = 0; i<src.length; i++)
			{
				dst[i]=src[i];
				System.out.println("ID: " + src[i] + " from array 1" + "ID: " + dst[i] + "from array 2");
			}
		}
		else if (src.length>dst.length)
		{
			System.out.println("Copying larger array to smaller");
			for(int i = 0; i<dst.length; i++)
			{
				dst[i]=src[i];
			}
			for(int i = 0; i<src.length; i++)
			{
				System.out.println("ID: " + src[i] + " from array 1");
			}
			for(int i = 0; i<dst.length; i++)
			{
				System.out.println("ID: " + dst[i] + " from array 2");
			}
		}
		else
		{
			System.out.println("Copying smaller array to larger");
			for(int i = 0; i<src.length; i++)
			{
				dst[i]=src[i];	
			}
			for (int i = src.length; i<dst.length; i++)
			{
				dst[i]=0;
			}
			for(int i = 0; i<src.length; i++)
			{
				System.out.println("ID: " + src[i] + " from array 1");
			}
			for(int i = 0; i<dst.length; i++)
			{
				System.out.println("ID: " + dst[i] + " from destination array");
			}

		}
	}


}
