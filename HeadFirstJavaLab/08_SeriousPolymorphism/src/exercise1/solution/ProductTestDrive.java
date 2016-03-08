package exercise1.solution;

import java.util.ArrayList;

public class ProductTestDrive {

	public static void main(String[] args) {	
		ArrayList<Product> products = new ArrayList<Product>();
		
		Book book = new Book();
		book.setCode("HFAnd");
		book.setPrice("44.95");
		book.setProductTitle("Head First Android");
		book.setTotalPages(608);

		products.add(book);
		
		Course course = new Course();
		course.setCode("COAnd");
		course.setPrice("995.00");
		course.setProductTitle("Introduction to Android Programming");
		course.setTextbook(book);
		
		products.add(course);
		
		Conference conference = new Conference();
		conference.setCode("OSConf");
		conference.setPrice("295.00");
		conference.setProductTitle("Open Source Conference");
		conference.setLocation("San Francisco");
		
		products.add(conference);
		
		for (Product product : products) {
			product.displayProduct();
		}
		
		System.out.println("Total Products: " + products.size());

	}

}
