package exercise1.begin;

public class Product {  // Double click on Product > F4
	
	String code;
	String productTitle;
	String price;
	
	void displayProduct() {
		System.out.println(this.toString());
	}
	
	public String toString() {
	    return "Code:\t" + code + "\n" +
	    "Title:\t" + productTitle + "\n" +
	    "Price:\t " + price + "\n"; 
	}
	
}
