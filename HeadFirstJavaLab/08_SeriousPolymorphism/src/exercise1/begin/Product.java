package exercise1.begin;

abstract public class Product {
	
	String code;
	String productTitle;
	String price;
	
	public abstract void displayProduct();
	
	public String toString() {
	    return "Code:\t\t" + code + "\n" +
	    "Title:\t\t" + productTitle + "\n" +
	    "Price:\t\t" + price + "\n"; 
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}	

}
