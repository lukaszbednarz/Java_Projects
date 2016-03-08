package exercise2.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IssueReader {

	private File file = null;
	private ArrayList<Issue> issues = null;

	private final String COLUMN_SEPARATOR = "|";

	public ArrayList<Issue> getIssues() {
		return issues;
	}

	public IssueReader() {
		issues = new ArrayList<Issue>();
		file = new File("IssueDB.txt");
		getAllIssues();
	}

	private void getAllIssues() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String currentLine = br.readLine();

			while (currentLine != null) {

				StringTokenizer st = new StringTokenizer(currentLine,
						COLUMN_SEPARATOR);
				String issueType = st.nextToken();
				String environment = st.nextToken();
				String summary = st.nextToken();
				Boolean isCompleted = Boolean.parseBoolean(st.nextToken());

				Issue i = new Issue();
				i.setIssueType(issueType);
				i.setEnvironment(environment);
				i.setSummary(summary);
				i.setCompleted(isCompleted);
				issues.add(i);

				currentLine = br.readLine();
			}
			br.close();

		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}

}
