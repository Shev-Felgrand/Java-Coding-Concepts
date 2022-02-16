package burger_Shop;

public class Person extends Entity {

	public Person(String name, double funds) {
		super(name, funds);
	}

	public Person(String name, double funds, Bill bill) {
		super(name, funds, bill);
	}

}
