package week01.day13.문제;

import java.util.ArrayList;

public class Book_test {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		
		
		book.add(new Book("1234","용의자X의헌신","게이고"));
		
		System.out.println(book);
		
		//문제8번
		
		book.add(new Book("AA1001","SpringMVC","최작가"));
		book.add(new Book("AA1001","SpringMVC","최작가"));
		book.add(new Book("AA1001","SpringMVC","최작가"));
	}

}
