public class Matrixchecker
{
	public boolean isSymmetrical(int[] num)
	{
		int length = num.length - 1;
		boolean symmet = true;
		for (int i=0; i<num.length; i++)
		{
			if (num[i]!=num[length-i])
			{
				symmet = false;
			}

		}
		return symmet;
	}

	public boolean isSymmetrical(int[][] num)
	{
		boolean symmet = true;
		for(int k=0; k<num.length; k++)
		{
			for (int l=0; l<num[0].length; l++)
			{
				if (num[k][l]!=num[l][k])
				{
					symmet = false;
				}
			}
		}
		return symmet;
	}

	public boolean isTriangular(int[][] num)
	{
		boolean valid = true;
		for(int i=0; i<num[0].length; i++)
		{
			for (int j=0; j<num.length; j++)
			{
				if (i>j)
				{
					if (num[i][j]!=0)
					{
						valid = false;
					}
				}
			}
		}
		return valid;
	}
}