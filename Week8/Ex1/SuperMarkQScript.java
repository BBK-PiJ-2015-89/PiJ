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
    	name.insert(new Person("John"));
    	name.insert(new Person("Happy"));
    	name.insert(new Person("Michael"));
    	name.insert(new Person("Alice"));
    	name.insert(new Person("Rebecca"));
    	name.insert(new Person("Charly"));
    	name.retrieve();

    }
}