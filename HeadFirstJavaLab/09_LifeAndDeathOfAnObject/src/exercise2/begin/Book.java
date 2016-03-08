package exercise2.begin;
//
public class Book extends Product {

	private int totalPages;
	
	// Constructors (2)

	void readBook() {
		System.out.println("Open book and begin reading");
	}
	
	public void displayProduct() {
		System.out.println(toString() + "Pages:\t" + totalPages + "\n");
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
}
