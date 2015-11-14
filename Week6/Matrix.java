public class Matrix
{
	int [][] m;

	public void createMatrix(int a, int b)
	{
		m = new int [a][b];
		for (int i = 0;i<a;i++)
		{
			for (int j = 0; j<b ;j++)
			{
				this.setElement(i,j,1);
			}
		}
	}

	public void setElement(int c, int d, int e)
	{
		m[c][d] = e;
	}
	
	public void setRow(int f, String s)
	{
		boolean valid = validityCheck(2,f,s);
		if (valid)
		{
			int j=0;
			String temp;
			for (int i=0; i<m[0].length; i++)//this is moving across the row
			{
				temp = "";
				if (j<s.length())
				{
					while(j<s.length() && s.charAt(j)!=',' )
					{
						temp += s.charAt(j);
						j++;
					}
					j++;
					m[f][i]= Integer.parseInt(temp);
					
				}
			}
		}
	}

	public void setColumn(int h, String k)
	{
		boolean valid = validityCheck(1,h,k);
		if (valid)
		{
			int j=0;
			String temp;
			for (int i=0; i<m.length; i++)//this is moving down the column
			{
				temp = "";
				if (j<k.length())
				{
					while(j<k.length() && k.charAt(j)!=',' )
					{
						temp += k.charAt(j);
						j++;
					}
					j++;
					m[i][h]= Integer.parseInt(temp);
					
				}
			}
		}
		else {
			System.out.println("Error Test");
		}
	}

	public String toString()
	{
		String value = "[";
		int width = m.length;
		int height = m[0].length;

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
		for (int i=0; i<m.length; i++)
		{
			
			for (int j=0; j<m[0].length; j++)
			{
				System.out.print(m[i][j]+",");
			}
			System.out.println('\t');
			
		}
	}

	public boolean validityCheck(int checkid, int num, String s)
	{
		int length1 = m.length;
		int length2 = m[0].length;
		int count = 1;
		boolean valid = true;

			for (int i = 0; i<s.length(); i++)
			{
				if (s.charAt(i)==',')
				{
					count++;
				}
			}

		if (checkid==1 && count==length1)
		{
			return valid;
		}
		else if (checkid==2 && count==length2)
		{
			return valid;
		}
		else
		{
			return valid=false;
		}
	}
}