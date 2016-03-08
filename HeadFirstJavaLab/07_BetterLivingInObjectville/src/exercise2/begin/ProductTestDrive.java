package exercise2.begin;

import exercise2.begin.Book;
import exercise2.begin.Conference;
import exercise2.begin.Course;

public class ProductTestDrive {

	public static void main(String[] args) {
		Product[] products = new Product[3];
		
		Book book = new Book();
		
		book.setCode("HFAnd");
		book.setPrice("44.95");
		book.setProductTitle("Head First Android");
		book.setTotalPages(608);
		
		products[0] = book;
		
		Course course = new Course();
		
		course.setCode("COAnd");
		course.setPrice("995.00");
		course.setProductTitle("Introduction to Android Programming");
		course.setTextbook(book);
		
		products[1] = course;
		
		Conference conference = new Conference();
		
		conference.setCode("OSConf");
		conference.setPrice("295.00");
		conference.setProductTitle("Open Source Conference");
		conference.setLocation("San Francisco");
		
		products[2] = conference;
		
		for (Product product : products) {
			product.displayProduct();
		}
		
		System.out.println("Total Products: " + products.length);
	}
	
}
