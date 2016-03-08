package exercise1.solution;

public class IssueTestDrive {
	
	public static void main(String[] args) {
		Issue i1 = new Issue();
		Issue i2 = new Issue();
		Issue i3 = new Issue();
		
		Issue[] issues = {i1, i2, i3};
		int totalIssues = issues.length;
		
		i1.enviroment = "Android";
		i1.summary = "Total needs formatting to two significant decimal places";
		i1.issueType = "Bug";

		i2.enviroment = "iPad";
		i2.summary = "Add geolocation to contact record";
		i2.issueType = "Feature";
		
		i3.enviroment = "JSP";
		i3.summary = "Add single sign-on logic";
		i3.issueType = "Feature";
		
		while (totalIssues > 0) {
			totalIssues -= 1;
			Issue currentIssue = issues[totalIssues];
			currentIssue.isCompleted = true;
			System.out.println(currentIssue.toString());
		}
	}
	
	
	
}

