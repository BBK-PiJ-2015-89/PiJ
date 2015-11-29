public class MyScript{
	
	public static void main(String[] args) {
		
		SimpleMapInter hashtable = new SimpleMap();
		boolean end1 = false;
		
		while (end1 != true)
		{
			System.out.println("Give me a string and I will calculate its hash code and enter it in to the hashtable (type end to finish)");
			String str = System.console().readLine();
			if (str.equals("end"))
			{
				end1 = true;
			}
			else
			{
				int hash = str.hashCode();
				int smallHash = HashUtilities.shortHash(hash);
				hashtable.put(smallHash, str);
				System.out.println("Added to hash table with key number: " + smallHash );
			}
		}

		System.out.println("Type a key you would like to reveal the contents of");
		String str = System.console().readLine();
		int tempkey = Integer.parseInt(str);
		System.out.println(hashtable.get(tempkey));


		System.out.println("Type a key you would like to remove from the table");
		str = System.console().readLine();
		tempkey = Integer.parseInt(str);
		hashtable.remove(tempkey);

		System.out.println("The table is empty: " + hashtable.isEmpty());


		/*System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
		System.out.println(hash);
		*/
	}
}