package exercise3.solution;

import java.util.ArrayList;

public class IssueTestDrive {
	
	public static void main(String[] args) {

		IssueReader ir = new IssueReader();
		ArrayList<Issue> issues = null;
		try {
			issues = ir.getIssues();
			for (Issue i : issues) {
				System.out.println(i.toString());
			}
		} catch (NoIssuesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Go to Monster.com to search for Scrum Project Managers");
		}
		

	}
	
}
