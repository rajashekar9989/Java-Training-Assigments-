package javaTraining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookManager {
	
	List<Book>bookList = null;
	
	public void addBooks()
	{
		Book b = new  Book("Circe",500,"author1","Fantasy");
		Book b1 = new Book("Ninth House",600,"author2","Fantasy");
		Book b2 = new Book("The Help",700,"author3","Fiction");
		Book b3 = new Book("One Hundred Years of Solitude",400,"author4","Fiction");
		Book b4 = new Book("The Ninth Fire",300,"author5","Mystery");
		Book b5 = new Book("The Advantures of Sherloch Holmes",800,"author6","Mystery");
		bookList=Arrays.asList(b,b1,b2,b3,b4,b5);
	}
	public List<Book>getBookByCategory(String categoryName){// function one fetch the books by category
		
		Predicate<Book>bookList1 = input->input.getCategory().equalsIgnoreCase(categoryName);
		return bookList.stream().filter(bookList1)
				.collect(Collectors.toList());
		
	}
	
	public  List<Book>  applyDiscountByCategoryAndPercentage(String categoryName,float discountPercentage){// function two fecth the all books with 10% discount
		Predicate<Book>bookList1 = input->input.getCategory().equalsIgnoreCase(categoryName);
	return bookList.stream()
			.filter(bookList1)
			.map(book ->book.withDiscountedPrice(discountPercentage))
			.collect(Collectors.toList());
	
	}
	
	public List<String> getBookName()//function :3  to get all books in bookstore
	{
		return bookList.stream().map(Book::getBookName).collect(Collectors.toList());
		
	}
	public List <Book> getCheapestBookInStore(int limit){  // function:4 to get  least price book price
		return bookList.stream().sorted().limit(limit).collect(Collectors.toList());
		
	}
//public List<Book>getMaxPriceBookByCategory(String categoryName){
//	
//	Predicate<Book> bookList1=input->input.getCategory().equalsIgnoreCase(categoryName);
//	return ((BookManager) bookList.stream().filter(bookList1)).getMaxPriceBookByCategory(categoryName);
//	
//			
//	}
//		
	}
	


