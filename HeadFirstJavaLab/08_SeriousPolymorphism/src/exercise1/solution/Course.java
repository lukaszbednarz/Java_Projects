package exercise1.solution;

public class Course extends Product {
	
	Book textbook;
	
	public void displayProduct() {
		System.out.println(toString() + "Textbook:\t" + textbook + "\n");
	}

	public Book getTextbook() {
		return textbook;
	}

	public void setTextbook(Book textbook) {
		this.textbook = textbook;
	}
	
	
}
