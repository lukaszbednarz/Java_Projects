package exercise1.solution;

public class Product {
	
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
