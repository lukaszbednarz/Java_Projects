package exercise1.solution;
//
public class Book extends Product {

	int totalPages;
	
	void readBook() {
		System.out.println("Open book and begin reading");
	}
	
	void displayProduct() {
		System.out.println(toString() + "Total Pages:\t" + totalPages + "\n");
	}

}
