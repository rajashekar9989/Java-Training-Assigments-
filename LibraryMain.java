
package libraryMode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.spring.xml");
// ApplicationContext context1 = new ClassPathXmlApplicationContext("LibraryManContext.xml");
		System.out.println("Book name: " + context.getApplicationName());
		Book book1 = (Book) context.getBean("book");
		System.out.println(book1);
		System.out.println("lib name: " + context.getApplicationName());
		BookLibrary library = (BookLibrary) context.getBean("booklibrary");
		System.out.println(library);
		System.out.println("lib Category name: " + context.getApplicationName());
		LibraryCat libraryCat = (LibraryCat) context.getBean("libCat");
		System.out.println(libraryCat);
		System.out.println("librarian name: " + context.getApplicationName());
		Librarian librarian = (Librarian) context.getBean("libra");
		System.out.println(librarian);
	}
}
