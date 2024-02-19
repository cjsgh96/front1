package week01.day13.문제;

public class Book {
	String bookCode;
	String bookTitle;
	String author;
	
	public Book(String bookCode, String bookTitle, String author) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", author=" + author + "]";
	}
	
	


	
}
