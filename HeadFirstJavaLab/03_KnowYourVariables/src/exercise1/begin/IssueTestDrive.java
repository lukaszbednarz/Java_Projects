package exercise1.begin;

public class IssueTestDrive {
	
	public static void main(String[] args) {
		
		Issue[] issues = new Issue[3];
		
		Issue i1 = new Issue();
		Issue i2 = new Issue();
		Issue i3 = new Issue();
		
		issues[0] = i1;
		issues[1] = i2;
		issues[2] = i3;
		
		/**/
		i1.enviroment = "Android";
		i1.summary = "Total needs formatting to two significant decimal places";
		i1.issueType = "Bug";

		i2.enviroment = "iPad";
		i2.summary = "Add geolocation to contact record";
		i2.issueType = "Feature";
		
		i3.enviroment = "JSP";
		i3.summary = "Add single sign-on logic";
		i3.issueType = "Feature";
		
		
		/*
		while (x < totalIssues) {

		}
		*/
	}
	
	
	
}
