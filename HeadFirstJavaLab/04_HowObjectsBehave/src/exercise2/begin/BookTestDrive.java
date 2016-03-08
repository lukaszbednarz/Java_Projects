package exercise2.begin;

public class BookTestDrive {

	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setProductTitle("Head First Java");
		book1.setTotalPages(732);
		book1.setInStock(true);
		
		System.out.println("Title: " + book1.getProductTitle());
		System.out.println("Total Pages: " + book1.getTotalPages());
		
		book1.getBookType();
		
	}

}
