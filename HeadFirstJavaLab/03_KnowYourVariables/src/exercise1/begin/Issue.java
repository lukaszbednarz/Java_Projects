package exercise1.begin;

public class Issue {
	
	String summary;
	String issueType;
	String enviroment;
	boolean isCompleted; 
	
	@Override
	public String toString() {
		return "Issue [enviroment=" + enviroment + ", isCompleted="
				+ isCompleted + ", issueType=" + issueType + ", summary="
				+ summary + "]";
	}
}
