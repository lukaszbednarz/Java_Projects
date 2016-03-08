package exercise2.begin;

import java.util.ArrayList;

public class IssueTestDrive {
	
	public static void main(String[] args) {

		IssueReader ir = new IssueReader();
		ArrayList<Issue> issues = ir.getIssues();
		
		for (Issue i : issues) {
			System.out.println(i.toString());
		}
	}
	
	
	
}
