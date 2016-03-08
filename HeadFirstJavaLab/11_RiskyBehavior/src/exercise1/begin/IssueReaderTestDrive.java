package exercise1.begin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IssueReaderTestDrive {

	public static void main(String[] args) {
		try {
			readIssueDB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Qualcomm: File I/O Error");
			
		}
		System.out.println("IssueReaderTestDrive.main() complete");
	}
	
	public static void readIssueDB() throws FileNotFoundException, IOException {
		File f = new File("IssueDB.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		System.out.println(br.readLine());
	}
}
