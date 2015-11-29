public class TreeIntScript
{
	public static void main(String[] args) {
		IntSet root = new TreeIntSet(6);
		root.add(5);
		root.add(7);
		root.add(8);
		root.add(9);
		root.add(3);
		System.out.println("Does the tree contain 5 = " + root.contains(5));
		System.out.println("Does the tree contain 10 = " + root.containsVerbose(10));
		System.out.println(root.toString());
	}
}