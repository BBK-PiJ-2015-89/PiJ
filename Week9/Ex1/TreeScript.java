public class TreeScript
{
	public static void main(String[] args) {
		IntegerTreeNode root = new IntegerTreeNode(6);
		root.add(5);
		root.add(9);
		root.add(3);
		System.out.println("Depth = " + root.depth());
		System.out.println("Max = " + root.getMax());
		System.out.println("Min = " + root.getMin());
		System.out.println(root.toString());
		System.out.println(root.simpletoString());
	}
}