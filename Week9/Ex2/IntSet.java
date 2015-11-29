public interface IntSet {
	// Adds a new int to the set, if one is already there it does nothing 
	add(int);
	//returns true if the number is in the set, false otherwise.
	contains(int);
	//returns the same values as the former method but for every element that is checked it prints its value on screen
	containsVerbose(int);
	//returns a string with the value of the elements in the set seperated by commas.
	toString();
}