import java.util.ArrayList;
import java.util.Scanner;

public class SalesTaxes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Product> items = new ArrayList<Product>();
		items.add(new NonTaxGoods("Book", 12.49, false));
		items.add(new TaxGoods("Music CD", 14.99, false));
		items.add(new NonTaxGoods("Chocolate", 0.85, false));
		items.add(new TaxGoods("Imported Box of Chcoclates", 10.00,true));
		items.add(new TaxGoods("Imported Box of Chcoclates", 11.25,true));
		items.add(new TaxGoods("Bottle of Perfume", 18.99, false));
		items.add(new TaxGoods("Imported bottle of Perfume", 47.50,true));
		items.add(new TaxGoods("Imported bottle of Perfume", 27.99,true));
		items.add(new NonTaxGoods("Package of headache pills", 9.75, false));
		
		Reciept receipt = new Reciept();
		ShoppingCart cart = new ShoppingCart();
		String answer = "y";
		
		while (answer.equalsIgnoreCase("y")) {
			int itemNum = 1;
			for (Product p : items) {
				System.out.println(itemNum++ + ". " + p);
			}

			System.out.println();
			int getItem = Validator.getInt(scan, "Please select an item: ", 1, itemNum-1);

			int quantity = Validator.getInt(scan, "How many do you want to add? ");

			if (items.get(getItem - 1) instanceof TaxGoods) {

				// I did this to make sure that the cart had it's own copy of the object
				// otherwise the cart was maintaining the added items and printing the quantity 
				TaxGoods tg = new TaxGoods(items.get(getItem - 1).getName(),
						items.get(getItem - 1).getPrice(), items.get(getItem - 1).getIsImport());
				tg.setQuantity(quantity);
				cart.addProducts(tg);
			} else {

				NonTaxGoods ntg = new NonTaxGoods(items.get(getItem - 1).getName(),
						items.get(getItem - 1).getPrice(), items.get(getItem - 1).getIsImport());
				ntg.setQuantity(quantity);
				cart.addProducts(ntg);
			}

			System.out.println();
			answer = Validator.getString(scan, "Add more items? Enter: (Y)/(N) ");
		}
		receipt.printReceipt(cart);
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		printItems(items);
//
//		int howMany = Validator.getInt(scan, "How Many items would you like?");
//
//		for (int i = 0; i < howMany; i++) {
//			int select = Validator.getInt(scan, "What item would you like?: ", 1, 9);
//			select = select - 1;
//			int amount = Validator.getInt(scan, "How many would you like?: ");
//			items.get(select).setQuantity(amount);
//			if (items.get(select) instanceof TaxGoods) {
//				Product newProduct = new TaxGoods();
//				newProduct.setName(items.get(select).getName());
//				newProduct.setPrice(items.get(select).getPrice());
//				newProduct.setQuantity(amount);
//				newProduct.setImport(items.get(select).getIsImport());
//				cart.add(newProduct);
//			} else {
//				if (items.get(select) instanceof NonTaxGoods) {
//					Product newProduct = new NonTaxGoods();
//					newProduct.setName(items.get(select).getName());
//					newProduct.setPrice(items.get(select).getPrice());
//					newProduct.setQuantity(amount);
//					newProduct.setImport(items.get(select).getIsImport());
//					cart.add(newProduct);
//				}
//			}
//			
//			
//			
//			printCart(cart);
//		}
//	}
//
//	public static int printItems(ArrayList<Product> items) {
//		int i = 0;
//		for (i = 0; i < items.size(); i++) {
//			System.out.println(i + 1 + ". " + items.get(i));
//		}
//		return i;
//	}
//
//	public static int printCart(ArrayList<Product> cart) {
//		int i = 0;
//		for (i = 0; i < cart.size(); i++) {
//			System.out.println(i + 1 + ". " + cart.get(i));
//		}
//		return i;
//	}
//
//}
