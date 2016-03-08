package exercise2.begin;

import java.util.Calendar;
import java.util.Date;

public class DateTestDrive {

	public static void main(String[] args) {

		//System.out.println("Offer Accepted On: " + offerAcceptedDate);
		
		Calendar c = Calendar.getInstance();
		c.add(c.DATE, 30); // Net 30 terms
		
		//System.out.println("Escrow (30 Days): " + c.getTime());
		
		Date houseCompleted = DateUtils.createDate(2007, 1, 15);
		
		//System.out.println("House Built = Years: " + houseYears + " / Days: " + houseDays);
	}
	
}
