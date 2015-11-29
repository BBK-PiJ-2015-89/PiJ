public interface IntegerTree {
	void add(int number);
	boolean contains(int number);
	int depth();
	String toString();
	String simpletoString();
	int getMax();
	int getMin();
}