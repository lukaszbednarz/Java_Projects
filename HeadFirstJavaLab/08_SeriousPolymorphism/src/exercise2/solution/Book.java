package exercise2.solution;
//
public class Book extends Product {

	String bookType;
	
	public String getViewableText() {
		return super.getViewableText() + "[ " + getBookType() + "]";
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

}
