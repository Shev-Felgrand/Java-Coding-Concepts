package burger_Shop;
import java.lang.reflect.Constructor;
import java.util.List;

public class Bills_Burgers<T> {
	Menu burgerMenu;

	public void Bills_Burgers() {
		this.burgerMenu = new Menu();
	}
	public void Bills_Burgers(List<T> list) {
		this.burgerMenu = new Menu(list);
	}
	public void Bills_Burgers(Menu burgerMenu) {
		this.burgerMenu = burgerMenu;
	}

	public void addBurgerComponents() {

	}
	public Burger makeBurger() {
		
		return null;
	}
	/*************
	 * Recursive part of the makeBurgers method that 
	 * asks the customer what they would like on their
	 * Burger.
	 * 
	 * @param name - Name of the component
	 * @param addComponent - if the customer would like to add a component to there burger
	 * @return bugerOrder - is the final result of the ordered burger
	 * */
	private Burger makeBurger(String name, boolean addComponent) {
		Burger burgerOrder = new Burger();
		//if addComponent equals false no more components to the burger
		return null;
	}

	public double sellBurger() {
		
		return -1;

	}

}
