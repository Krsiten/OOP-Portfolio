import java.util.ArrayList;

public class Book {
	ArrayList<String> bookInfo = new ArrayList<String>();

	public Book(String title, String author,
			String publisher, String copyright) {
		bookInfo.add(title);
		bookInfo.add(author);
		bookInfo.add(publisher);
		bookInfo.add(copyright);
	}

	public ArrayList<String> getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String newTitle, String newAuthor,
			String newPublisher, String newCopyright) {
		bookInfo.set(0, newTitle);
		bookInfo.set(1, newAuthor);
		bookInfo.set(2, newPublisher);
		bookInfo.set(3, newCopyright);
	}

	public String toString() {
		getBookInfo();
		return "The title of the book is " + bookInfo.get(0) + ", was written by " + bookInfo.get(1)
				+ ", and pubished by " + bookInfo.get(2) + ". The copyright date is " + bookInfo.get(3);
		
	}
}