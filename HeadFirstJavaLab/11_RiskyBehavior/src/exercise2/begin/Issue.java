package exercise2.begin;

public class Issue {
	
	String summary;
	String issueType;
	String environment;
	boolean isCompleted; 
	
	public String toString() {
		return issueType + " = " + summary + ": " + environment + " | " + isCompleted;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String enviroment) {
		this.environment = enviroment;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
}
