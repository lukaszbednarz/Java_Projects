package exercise2.begin;
//
public class Book extends Product {

	int totalPages;
	
	void readBook() {
		System.out.println("Open book and begin reading");
	}
	
	void displayProduct() {
		System.out.println(toString() + "Pages:\t" + totalPages + "\n");
	}

	
}
