public class SuperMarkQScript {
    public static void main(String[] args) {
	  SuperMarkQScript script = new SuperMarkQScript();
	  script.launch();
    }
    public void launch() {
	  Supermarket sainsburys = new Supermarket("sainsburys");
	  testqueue(sainsburys, "Sainsbury's");
    }

    public void testqueue(Supermarket name, String supermarket)
    {
    	System.out.println("Adding customers to the queue in " + supermarket);
    	name.addPerson(new Person("John", 77));
    	name.addPerson(new Person("Happy", 2));
    	name.addPerson(new Person("Michael", 21));
    	name.addPerson(new Person("Alice", 33));
    	name.addPerson(new Person("Rebecca", 90));
    	name.addPerson(new Person("Charly", 66));
    	name.servePerson();
        name.servePerson();
        name.servePerson();
        name.servePerson();
        name.servePerson();
        name.servePerson();
        name.servePerson();

    }
}