package exercise1.solution;

public class Issue {
	
	String summary;
	String issueType;
	boolean isCompleted;
	String enviroment;
			
	public Issue() {}

	public Issue(String summary, String issueType, boolean isCompleted, String enviroment) {
		this.summary = summary;
		this.issueType = issueType;
		this.isCompleted = isCompleted;
		this.enviroment = enviroment;
	}

	public String toString() {
		return issueType + " = " + summary + ": " + enviroment + " | " + isCompleted;
	}
}
