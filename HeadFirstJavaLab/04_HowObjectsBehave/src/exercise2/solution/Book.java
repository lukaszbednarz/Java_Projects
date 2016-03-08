package exercise2.solution;

public class Book extends Product {

	private int totalPages;
	private boolean isInStock;
	
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
