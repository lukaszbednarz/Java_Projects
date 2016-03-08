package exercise2.solution;
//
public class Book extends Product {

	int totalPages;
	
	void readBook() {
		System.out.println("Open book and begin reading");
	}
	
	void displayProduct() {
		System.out.println(toString() + "Pages:\t" + totalPages + "\n");
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
}
