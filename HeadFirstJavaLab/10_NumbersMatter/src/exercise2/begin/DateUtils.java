package exercise2.begin;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	
	
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


	
}
