package exercise1.begin;

import java.util.GregorianCalendar;

public class UseAIssue {

	public static void main(String[] args) {
		
		Issue issue1 = new Issue("Add geolocation to contact record", "Feature", "iPad", false);
		System.out.println(issue1.toString());
		
		Issue issue2 = new Issue("Formula incorrect for GPS", "Bug", "Android");
		System.out.println(issue2.toString());
		

	}
	
}
