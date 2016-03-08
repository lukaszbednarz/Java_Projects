package exercise1.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IssueReaderTestDrive {

	public static void main(String[] args) {
			try {
				readIssueDB();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void readIssueDB() throws FileNotFoundException {
		File f = new File("IssueDBA.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
	}
}
