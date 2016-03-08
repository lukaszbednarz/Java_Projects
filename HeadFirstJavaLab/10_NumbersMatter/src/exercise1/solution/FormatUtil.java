package exercise1.solution;

import java.text.NumberFormat;

public class FormatUtil {
	static public String getFormattedTotal(double total){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String formattedTotal = currency.format(total);
		return formattedTotal;
	}
}
