public interface IntSet {
	// Adds a new int to the set, if one is already there it does nothing 
	void add(int n);
	//returns true if the number is in the set, false otherwise.
	boolean contains(int n);
	//returns the same values as the former method but for every element that is checked it prints its value on screen
	boolean containsVerbose(int n);
	//returns a string with the value of the elements in the set seperated by commas.
	String toString();
}