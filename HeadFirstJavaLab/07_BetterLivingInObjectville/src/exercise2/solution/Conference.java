package exercise2.solution;

public class Conference extends Product {
	
	String location;

	void attendConference() {
		System.out.println("Attend conference: " + location);
	}
	
	void displayProduct() {
		System.out.println(toString() + "Location:\t" + location + "\n");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}

