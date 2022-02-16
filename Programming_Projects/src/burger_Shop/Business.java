package burger_Shop;

public class Business extends Entity {

	public Business(String name, double funds) {
		super(name, funds);
	}

	public Business(String name, double funds, Bill bill) {
		super(name, funds, bill);
	}

}
