package burger_Shop;
import java.util.HashMap;
import java.util.List;

public class Menu<T> {
HashMap<String, Inventory> avalibleComponents;

	public Menu() {
		this.avalibleComponents = new HashMap<String , Inventory>();
	}
	
	public Menu(List<T> list) {
		
	}
	
	public void addComponent(String name, String price, String foodType) {
		avalibleComponents.put(name, new Inventory(name, price, foodType));
	}
	
	public void removeComponent(String name) {
		avalibleComponents.remove(name);
	}
	
	public void getComponent() {
		
	}
}
