package exercise2.begin;

public class HeadFirstInvoice {

	public static void main(String[] args) {
		double[] items = {5,12,7};
		double subtotal = 0.0;
		double discountPercent = 0.0;
		double total = 0.0;
		
		int itemsInCart = items.length;
		
		// while loop: Checkout
		while (itemsInCart > 0) {
			itemsInCart -= 1;
			double currentItemPrice = items[itemsInCart];
			subtotal += currentItemPrice;
			System.out.println("Item price: " + currentItemPrice);
		}
		System.out.println("Current Instructor subtotal: "+ subtotal);
		
		System.out.println("===========================");

		// branching: Discount Percent
		if (subtotal >= 50) {
			discountPercent = 0.3;
		} 
		else if (subtotal >= 20) {
			discountPercent = 0.15;
		}
		else if (subtotal >= 10) {
			discountPercent = 0.0;
		}
		
		double discountAmmount = subtotal * discountPercent;
		total = subtotal - discountAmmount;
		
    	String message = "Discount percent: " + discountPercent + "\n"
        			   + "Invoice total: " + total + "\n";
    	
    	System.out.println(message);

	}

}
