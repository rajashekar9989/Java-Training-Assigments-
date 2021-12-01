package javaTraining;

import java.util.List;
import java.util.Scanner;

public class BookShop {

	public static void main(String[] args) {
		
		BookManager bookmanager = new BookManager();
		bookmanager.addBooks();// object will be instantiated  and added to the list
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the category");
		String categoryName =scan.next();
		
		List<Book>result =bookmanager.getBookByCategory(categoryName);
		result.stream().forEach(System.out:: println);
		
		List<Book>bookListWithDiscountedPrice = bookmanager.applyDiscountByCategoryAndPercentage( categoryName, 0.1f);
		
	bookListWithDiscountedPrice.stream().forEach(System.out :: println);
	
	List<String>availableBookNames = bookmanager.getBookName();
	availableBookNames.stream().forEach(System.out::println);
		
		System.out.println("eneter the number of least price books");
		int limit=scan.nextInt();
		List<Book> result1=bookmanager.getCheapestBookInStore(limit);
		result1.stream().forEach(System.out::println);

List<String> bookNamesWithMaxPriceInEachCate =bookmanager.getBookName();
bookNamesWithMaxPriceInEachCate.stream().forEach(System.out::println);
    
	}
	

}
