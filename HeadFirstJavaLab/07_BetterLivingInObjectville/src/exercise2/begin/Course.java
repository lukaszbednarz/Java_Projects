package exercise2.begin;

public class Course extends Product {
	
	Book textbook;
	
	void displayProduct() {
		System.out.println(toString() + "Textbook:\t" + textbook.productTitle + "\n");
	}

	public Book getTextbook() {
		return textbook;
	}

	public void setTextbook(Book textbook) {
		this.textbook = textbook;
	}
	
	
}