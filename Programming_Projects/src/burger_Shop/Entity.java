package burger_Shop;

import java.util.HashMap;

public class Entity implements Pay{
	//has money
	private String name;
	private double curFunds;
	private HashMap<Integer,Bill> bills;
	private int borrowCount;
	
	//picture
	//inventory
	
	public Entity(String name, double funds) {
		bills = new HashMap<Integer,Bill>();
		this.name = name;
		this.curFunds = funds;
	}
	public Entity(String name, double funds, Bill bill) {
		bills = new HashMap<Integer,Bill>();
		setBills(bill);
		this.name = name;
		this.curFunds = funds;
	}
	
	public void setBills(Bill bill) {
		if(bill == null)
			System.out.println("Bill null in setBills.");
		this.bills.put(bill.getToPay().getSerialNumber(), bill);
	}
	/***************************************************
	 * 
	 * This is the getter for current Bills needing to be payed
	 * 
	 * */
	public HashMap<Integer,Bill> getBills() {
		
		return bills;
		
	}
	/***************************************************
	 * 
	 * This is the getter for the next income Income
	 * 
	 * */
	public double getFunds() {
		
		return curFunds;
		
	}
	/***************************************************
	 * 
	 * This is the getter for the name of the entity
	 * 
	 * */
	public String getName() {
		
		return name;
		
	}
	@Override
	public void borrowMoney(double amountBorrowed) {
		this.curFunds += amountBorrowed;
		Bill tempBill = new Bill(new Payment("Borrowed Money #"+borrowCount, amountBorrowed), true, true, 30);
		this.bills.put(tempBill.getToPay().getSerialNumber(), tempBill);
	}
	@Override
	public void makePayment(double payAmount, String entityPayed) {
		
	}
}
