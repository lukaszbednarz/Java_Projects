package exercise1.begin;

import java.util.ArrayList;

public class ProductTestDrive {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>(); // convert to ArrayList
		
		Book book = new Book();
		book.setCode("HFAnd");
		book.setPrice("44.95");
		book.setProductTitle("Head First Android");
		book.setTotalPages(608);
		
		// Add by ArrayList syntax
		products.add(book);
		
		Course course = new Course();
		course.setCode("COAnd");
		course.setPrice("995.00");
		course.setProductTitle("Introduction to Android Programming");
		course.setTextbook(book);
		
		// Add by ArrayList syntax
		products.add(course);
		
		Conference conference = new Conference();
		conference.setCode("OSConf");
		conference.setPrice("295.00");
		conference.setProductTitle("Open Source Conference");
		conference.setLocation("San Francisco");
		
		// Add by ArrayList syntax
		products.add(conference);
		
		Webinar webinar = new Webinar();
	    webinar.setCode("ANDS");
	    webinar.setPrice("Free");
	    webinar.setProductTitle("Android Seminar");
	    webinar.setMeetingURL("http://www.oreilly.com/webinar");
	    
	    // Add by ArrayList syntax
	    products.add(webinar);
	    
		
		for (Product product : products) {
			product.displayProduct();
		}
		
		System.out.println("Total Products: " + products.size());
	}
	
}
