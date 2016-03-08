package exercise2.solution;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	
	static final int MILLS_IN_DAY = 60 * 60 * 24 * 1000 ;
	
	public static Date createDate(int year, int month, int day)
	{
		GregorianCalendar d = new GregorianCalendar(year, month, day);
		return d.getTime();
	}
	
	public static Date getCurrentDate() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.HOUR, 0);
		return c.getTime();
	}
	
	public static Date removeTime(Date date) {
		Calendar currentDate = Calendar.getInstance();
		currentDate.setTime(date);
		currentDate.set(Calendar.HOUR, 0);
		currentDate.set(Calendar.MINUTE, 0);
		currentDate.set(Calendar.SECOND, 0);
		return currentDate.getTime();
	}

	public static int daysDiff(Date date1, Date date2) {
		date1 = removeTime(date1);
		date2 = removeTime(date2);
		long longDate1 = date1.getTime();
		long longDate2 = date2.getTime();
		long longDiff = longDate2 - longDate1;
		return (int) (longDiff / MILLS_IN_DAY);
	}
	
}
