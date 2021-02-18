
public class CalculateTax {

	private double total;
	
	public void register(Taxable taxable) {
		this.total += taxable.getTaxValue();
	}
	
	public double getTotal() {
		return total;
	}

}
