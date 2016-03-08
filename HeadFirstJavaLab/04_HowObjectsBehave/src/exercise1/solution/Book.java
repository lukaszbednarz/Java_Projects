package exercise1.solution;
//
public class Book extends Product {

	int totalPages;
	
	void getBookType() {
		if (totalPages < 25) {
			System.out.println("Type: Short Story");
		} else if (totalPages < 100) {
			System.out.println("Type: Novella");
		} else if (totalPages < 500) {
			System.out.println("Type: Novel");
		} else {
			System.out.println("Type: Epic");
		}
	}

}
