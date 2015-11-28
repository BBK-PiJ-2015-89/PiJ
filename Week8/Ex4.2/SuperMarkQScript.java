public class SuperMarkQScript {
    public static void main(String[] args) {
	  SuperMarkQScript script = new SuperMarkQScript();
	  script.launch();
    }
    public void launch() {
	  PersonQueue sainsburys = new SupermarketQueue("sainsburys");
	  testqueue(sainsburys, "Sainsbury's");
    }

    public void testqueue(PersonQueue name, String supermarket)
    {
    	System.out.println("Adding customers to the queue in " + supermarket);
    	name.insert(new Person("John", 14));
    	name.insert(new Person("Happy", 29));
    	name.insert(new Person("Michael", 89));
    	name.insert(new Person("Alice", 68));
    	name.insert(new Person("Rebecca", 24));
    	name.insert(new Person("Charly", 10));
    	name.retrieve();

    }
}