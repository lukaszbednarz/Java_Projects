package exercise1.solution;

public class BookTestDrive {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.totalPages = 20;
		book1.getBookType();
		
		Book book2 = new Book();
		book2.totalPages = 90;
		book2.getBookType();
		
		Book book3 = new Book();
		book3.totalPages = 350;
		book3.getBookType();
		
		Book book4 = new Book();
		book4.totalPages = 1000;
		book4.getBookType();
	}
	
}
