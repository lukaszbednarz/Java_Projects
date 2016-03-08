package exercise1.begin;

public class Issue {
	
	String summary;
	String issueType;
	String enviroment;
	boolean isCompleted;
	
	public Issue() {}
			
	public Issue(String summary, String issueType, String environment) {
		this.summary = summary;
		this.issueType = issueType;
		this.enviroment = environment;
	}

	public Issue(String summary, String issueType, String enviroment,
			boolean isCompleted) {
		
		this.summary = summary;
		this.issueType = issueType;
		this.enviroment = enviroment;
		this.isCompleted = isCompleted;
	
	}

	public String toString() {
		return issueType + " = " + summary + ": " + enviroment + " | " + isCompleted;
	}
}
