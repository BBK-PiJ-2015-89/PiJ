public class HashUtilities{

	static public int shortHash(int hash)
	{
		int hashabsol = Math.abs(hash);
		return hashabsol%1000;
	}
}