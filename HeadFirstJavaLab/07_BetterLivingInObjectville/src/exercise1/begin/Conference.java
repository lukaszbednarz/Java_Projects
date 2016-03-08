package exercise1.begin;

public class Conference extends Product {
	
	String location;
	
	void attendConference() {
		System.out.println("Attend conference: " + location);
	}

	@Override
	void displayProduct() {
		// TODO Auto-generated method stub
		super.displayProduct();
		System.out.println("Location:\t" + location + "\n"); //enhanced new property
	}
	
}
