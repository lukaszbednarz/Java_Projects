package exercise1.solution;

import java.text.NumberFormat;
import static java.lang.System.out;

public class FutureValueTestDrive {
	
	public static void main(String[] args) {
		
		out.println("Head First Retirement Calculator");
		
		int months = 360 ;
		double monthlyAmount = 1000;
		double interestRate = 5;
		double monthlyInterestRate = interestRate/12/100;
		
		double retirementFutureValue = FinancialUtil.calculateFutureValue(monthlyInterestRate, monthlyAmount, months);
		
		String formattedTotal = FormatUtil.getFormattedTotal(retirementFutureValue);
		
		out.println(formattedTotal);
		
	}
}
