
public class NonTaxGoods extends Product{
	public NonTaxGoods(String name, double price) {
		super(name, price);
	}
	
	public NonTaxGoods(String name, double price, int quantity) {
		super(name, price, quantity);
		
	}

	public NonTaxGoods(String name, double price,boolean isImport) {
		super(name, price, isImport);
		
	}

	@Override
	public double calcTax() {
		if(getIsImport() == true) {
			
			return getPrice() * .05;
		}else {
			return 0;
		}
		
	}
	
	

}
