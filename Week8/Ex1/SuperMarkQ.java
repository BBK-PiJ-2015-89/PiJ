public class SuperMarkQ {
    public static void main(String[] args) {
	  SuperMarkQ script = new SuperMarkQ();
	  script.launch();
    }
    public void launch() {
	  PersonQueue sainsburys = new SupermarketQueue("sainsburys");
	  testqueue(sainsburys, "Sainsbury's");
	  PersonQueue tesco = new SupermarketQueue("Teso");
	  testqueue(tesco, "Tesco");
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
        name.retrieve();
        name.retrieve();
        name.retrieve();

    }
}