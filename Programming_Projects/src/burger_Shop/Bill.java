package burger_Shop;

public class Bill {
	private Payment toPay;
	private Payment madePayments;
	private int payPeriod;
	private boolean hasTaxesApply;
	private boolean reaccuring;

	public Bill(Payment toPay, boolean hasTaxesApply, boolean reaccuring, int payPeriod) {
		this.toPay = toPay;
		this.hasTaxesApply = hasTaxesApply;
		this.reaccuring = reaccuring;
		if(this.reaccuring)
			this.payPeriod = payPeriod;
		else
			this.payPeriod = -1;
	}
public Payment getToPay() {
	return toPay;
}

}
