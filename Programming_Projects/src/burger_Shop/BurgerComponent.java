package burger_Shop;
import java.util.ArrayList;

public class BurgerComponent<T> {

	String name;
	String price;
	String foodType;
	
	public BurgerComponent(String name, String price, String foodType) {
		this.name = name;
		this.price = price;
		this.foodType = foodType;
	}
	
	public BurgerComponent(ArrayList<T> menuList) {
		
	}

	public void changeName(String name) {
		this.name = name;
	}
	
	public void changePrice(String price) {
		this.price = price;
	}
	
	public void changeFoodType(String foodType) {
		this.foodType = foodType;
	}
	
}
