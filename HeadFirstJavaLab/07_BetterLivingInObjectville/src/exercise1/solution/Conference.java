package exercise1.solution;

public class Conference extends Product {
	String location;

	void attendConference() {
		System.out.println("Attend conference: " + location);
	}
	
	void displayProduct() {
		System.out.println(toString() + "Location:\t" + location + "\n");
	}
}

