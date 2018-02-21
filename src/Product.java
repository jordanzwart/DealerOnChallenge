
public abstract class Product {
	private String name;
	private double price;
	private int quantity;
	private boolean isImport;
		
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}

	public Product(String name, double price, boolean isImport) {
		super();
		this.name = name;
		this.price = price; 
		this.isImport = isImport;
	}
	
	public boolean getIsImport() {
		return isImport;
	}
	
	public void setImport(boolean isImport) {
		this.isImport = isImport;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public abstract double calcTax();
	

	@Override
	public String toString() {
			if (getQuantity() > 1) {
				return String.format("%s $%.2f (%s @ $%.2f)", getName(), (getPrice() * getQuantity()), getQuantity(),
						getPrice());
			}
			return String.format("%s $%.2f", getName(), getPrice());
	}
	
	
	

}


