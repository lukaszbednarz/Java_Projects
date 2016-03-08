package exercise1.solution;

public class FinancialUtil {
	
	public static double calculateFutureValue(double monthlyInterestRate, double monthlyAmount,  int months) {
		
		double futureValue = 0;
		
		for (int i = 1; i <= months; i++) {
			futureValue = (futureValue + monthlyAmount) * (1 + monthlyInterestRate);
		}
		return futureValue;
	}
	
}
