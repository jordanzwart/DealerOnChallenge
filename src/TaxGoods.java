
public class TaxGoods extends Product {

	public TaxGoods(String name, double price) {
		super(name, price);
	}
	
	public TaxGoods(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	public TaxGoods(String name, double price, boolean isImport) {
		super(name, price, isImport);
	
	}

	@Override
	public double calcTax() {
		if (getIsImport() == true) {
			return getPrice() * .15;
		} else {
			return getPrice() * .10;
		}

	}
}
