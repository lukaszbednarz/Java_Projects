package exercise1.begin;

// Since the book covers this case study in detail, this will be done as an exercise
public class SimpleDotCom {
	// Properties
	int[] locationCells;
	int numOfHits = 0;
	
	// Methods
	public void setLocationCells(int[] locs) {
		locationCells = locs;		
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);				
		String result = "miss";
		
		for (int cell : locationCells) {
			if (guess == cell) { // Bug
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		
		System.out.println(result);
		return result;
	}
}
