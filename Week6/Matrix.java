public class Matrix
{
	int [][] m;

	public void createMatrix(int a, int b)
	{
		m= new int [a][b];
		for (int i = 0;i<a;i++)
		{
			for (int j = 0 ; j<b ;j++)
			{
				this.setElement(i,j,1);
			}
		}
	}

	public void setElement(int c, int d, int e)
	{
		m[c][d] = e;
	}
	
	public void setRow(int f, String d)
	{
		int j=0;
		for (int i=0; i<m[1].length; i++)//this is moving across the row
		{
			if (j<d.length())
			{
				if(d.charAt(j)==','){}
					else
					{
						m[f][i]= d.charAt(j);
					}
				j++;
			}
		}
	}

	public void setColumn(int h, String k)
	{
		
		for (int i=0; i<m[0].length; i++)//this is moving down the column
		{
			int j=0;
			if (j<k.length())
			{
				if(k.charAt(j)==','){}
					else
					{
						m[i][h]= k.charAt(j);
					}
				j++;
			}
		}
	}

	public String toString()
	{
		String value = "[";
		int width = 2;
		int height = 2;

		for (int i=0; i<width; i++)
		{
			for (int j=0; j<height; j++)
			{
				value += m[i][j];
				if (j<height-1)
				{
					value += ",";
				}
				else if (i==(width-1) && j==(height-1))
				{

				}
				else
				{
					value += ";";
				}

			}
		}
		value += "]";
		return value;
	}

	public void prettyPrint()
	{
		for (int i=0; i<m[0].length; i++)
		{
			System.out.println('\t');
			for (int j=0; j<m[1].length; j++)
			{
				System.out.println(m[i][j]);
			}
		}
	}
}