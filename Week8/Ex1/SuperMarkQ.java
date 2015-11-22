public class SuperMarkQ {
    public static void main(String[] args) {
	  SuperMarkQ script = new SuperMarkQ();
	  script.launch();
    }
    public void launch() {
	  PersonQueue sainsburys = new SupermarketQueue("sainsburys");
	  testqueue(sainsburys);
	  PersonQueue tesco = new SupermarketQueue("Teso");
	  testqueue(tesco);
    }

    public void testqueue(PersonQueue name)
    {
    	System.out.println("Adding customers to the queue in " + name);
    	name.insert(new Person("John"));
    	name.insert(new Person("Happy"));
    	name.insert(new Person("Michael"));
    	name.insert(new Person("Alice"));
    	name.insert(new Person("Rebecca"));
    	name.insert(new Person("Charly"));
    	name.retrieve();

    }
}