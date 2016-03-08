package exercise2.solution;
//
public class Book extends Product {

	private int totalPages;
	
	public Book() {}
			
	public Book(String code, String productTitle, String price, int totalPages) {
		super(code, productTitle, price);
		this.totalPages = totalPages;
	}

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
