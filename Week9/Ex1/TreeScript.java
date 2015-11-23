public class TreeScript
{
	public static void main(String[] args) {
		IntegerTreeNode root = new IntegerTreeNode(9);
		root.add(13);
		root.add(6);
		root.add(8);
		root.add(7);
		System.out.println("Depth = " + root.depth());
		System.out.println("Max = " + root.getMax());
		System.out.println("Min = " + root.getMin());
	}
}