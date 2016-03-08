package exercise2.begin;

import java.util.ArrayList;

public class InterfaceTestDrive {

	public static void main(String[] args) {
		
		ArrayList<IViewable> viewableItems = new ArrayList<IViewable>();
		
		Robot robot = new Robot();
		
		viewableItems.add(robot);
		
		Book book = new Book();
		book.setCode("HFANDR");
		book.setProductTitle("Head First Android");
		book.setBookType("Kindle Edition");
		
		viewableItems.add(book);
		
		
		for(IViewable currentItem : viewableItems) {
			System.out.println(currentItem.getViewableText());
		}

	}
	
}
