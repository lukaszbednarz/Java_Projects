package exercise2.solution;

public class Course extends Product {
	
	Book textbook;
	
	void displayProduct() {
		System.out.println(toString() + "Textbook:\t" + textbook + "\n");
	}

	public Book getTextbook() {
		return textbook;
	}

	public void setTextbook(Book textbook) {
		this.textbook = textbook;
	}
	
	
}
