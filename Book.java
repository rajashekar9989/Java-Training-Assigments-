package javaTraining;

public class Book implements Comparable<Book> {
	
	private String bookName;
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName=" + authorName + ", category="
				+ category + "]";
	}
	public Book(String bookName, float bookPrice, String authorName, String category) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.category = category;
	}
	private float bookPrice;
	private String authorName;
	private String category;
	public String getBookName() {
		return bookName;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getCategory() {
		return category;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setCategory(String category) {
		this.category = category;
	}
public Book withDiscountedPrice(float  discountPercentage) {                // Create a function 

	this.setBookPrice(this.getBookPrice()- (this.getBookPrice()*discountPercentage));
	return this;
}

public int compareTo(Book o) {
	return this.getBookPrice()>o.bookPrice
			?1
			:this.getBookPrice()==o.bookPrice
			?0
			:-1;
	
}
}
