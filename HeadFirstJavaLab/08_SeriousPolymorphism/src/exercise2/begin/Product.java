package exercise2.begin;

abstract public class Product implements IViewable  {
	
	String code;
	String productTitle;
	
	public String getViewableText() {
		return getProductTitle() + " (" + getCode() + ") ";
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
	
}
