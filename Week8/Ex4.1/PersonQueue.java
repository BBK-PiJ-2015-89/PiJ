public interface PersonQueue
{
	// Adds a  person to queue
	void insert(Person person);

	//Removes a person from the queue
	Person retrieve();
}