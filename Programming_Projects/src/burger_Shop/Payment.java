package burger_Shop;

import java.util.Random;

public class Payment {
	private String name;
	private int serialNumber;
	private double price;
	
	public Payment(String name, double price) {
		this.name = name;
		this.price = price;
		serialNumber = setSerialNumber(); //maybe use set serialNumbers would be better, this works for now
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	private int setSerialNumber() {
		Random rand =new Random();
		String tempNum = null;
		while(tempNum.length()<11) {
			tempNum += rand.nextInt(1000) + (rand.nextInt(10) * 1000);
		}
		return this.serialNumber = Integer.parseInt(tempNum);
	}
	
}
