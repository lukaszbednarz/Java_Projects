package exercise1.begin;

public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess = "5";
		
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed"; // Default: failed
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}
}

