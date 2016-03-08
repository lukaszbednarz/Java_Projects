package exercise1.begin;

public class Webinar extends Product {
	
	String meetingURL;

	@Override
	public void displayProduct() {
		// TODO Auto-generated method stub
		System.out.println(toString() + "Meeting URL:\t" + meetingURL + "\n");
		
	}

	public String getMeetingURL() {
		return meetingURL;
	}

	public void setMeetingURL(String meetingURL) {
		this.meetingURL = meetingURL;
	}
	
	

}
