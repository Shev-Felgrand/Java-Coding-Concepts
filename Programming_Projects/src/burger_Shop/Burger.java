package burger_Shop;
import java.util.ArrayList;

public class Burger<T> {
	
	double price;
//	String burgerName;
//	String meat;
//	String breadType;
	ArrayList<BurgerComponent<T>> burgerComponents;
	public Burger() {
		burgerComponents = new ArrayList<BurgerComponent<T>>();
	}
	public Burger(double price, String Name) {
		this.price = price;
		
	}

	public void addComponents(double price, String compoName) {
		this.price += price;
//		burgerComponents.add(compoName);
	}

}
