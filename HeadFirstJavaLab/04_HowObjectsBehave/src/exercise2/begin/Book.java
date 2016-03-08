package exercise2.begin;

public class Book extends Product {
    
	// Properties
	private int totalPages;
	private boolean isInStock;
	
	//Constructor
	
	// Methods: Custom
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

	//Methods: Getters / Setters
	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public boolean isInStock() {
		return isInStock;
	}

	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

		
}
