package exercise1.begin;

public class Issue {
	
	String summary;
	String issueType;
	String environment;
	boolean isCompleted;
	
	@Override
	public String toString() {
		return "Issue [summary=" + summary + ", issueType=" + issueType
				+ ", environment=" + environment + ", isCompleted="
				+ isCompleted + "]";
	}
	
	

}
