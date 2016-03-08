package exercise3.solution;

public class NoIssuesException extends Exception {
	
	public NoIssuesException() {
		super();
	}
	
	public NoIssuesException(String message) {
		super(message);
	}

	public NoIssuesException(Throwable cause) {
		super(cause);
		System.out.println("NoIssuesException: Throwable constructor called");
	}
	
}
