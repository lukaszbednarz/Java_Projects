package exercise1.begin;
//
public class Book extends Product { // Double click on Book > F4

	// Add Property
	int totalPages;
	
	void readBook() {
		System.out.println("Open book and begin reading");
	}
	
	// Override displayProduct: append Custom Property
	@Override
	void displayProduct() {
		// TODO Auto-generated method stub
		super.displayProduct();
		System.out.println("Total Pages:\t" + totalPages + "\n");
	}
}
