package exercise1.begin;

import java.util.ArrayList;

public class DotComTestDrive {
	public static void main(String[] args) {
		DotCom dot = new DotCom();

		// Code
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		
		dot.setLocationCells(locations);
		
		dot.checkYourself("2");
		dot.checkYourself("3");
		String result = dot.checkYourself("4");
		
		
		
		String testResult = "failed";
		if (result.equals("kill")) {
			testResult = "Game over";
		}
		System.out.println(testResult);
	}
}

