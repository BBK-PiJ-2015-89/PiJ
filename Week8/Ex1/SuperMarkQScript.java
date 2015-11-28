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
    	name.addPerson(new Person("John"));
    	name.addPerson(new Person("Happy"));
    	name.addPerson(new Person("Michael"));
    	name.addPerson(new Person("Alice"));
    	name.addPerson(new Person("Rebecca"));
    	name.addPerson(new Person("Charly"));
    	name.servePerson();
        name.servePerson();
        name.servePerson();
        name.servePerson();
        name.servePerson();
        name.servePerson();
        name.servePerson();

    }
}