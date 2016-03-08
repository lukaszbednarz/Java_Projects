package exercise2.solution;

public class ProductTestDrive {

	public static void main(String[] args) {	
		
		Book book1 = new Book();
		book1.setCode("HFANDR");
		book1.setPrice("44.95");
		book1.setProductTitle("Head First Android");
		book1.setTotalPages(608);
		
		System.out.println(book1.toString());

		Book book2 = new Book("HFJAVA","Head First Java", "44.95", 688);
		
		System.out.println(book2.toString());
	}

}
