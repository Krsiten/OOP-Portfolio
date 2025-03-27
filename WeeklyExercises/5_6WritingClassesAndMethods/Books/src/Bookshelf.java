
public class Bookshelf {

	public static void main(String[] args) {
		Book book1 = new Book("A Song of Ice and Fire", "George R.R. Martin", "Voyager Books", "1996");
		Book book2 = new Book("The Gunslinger", "Stephan King", "Mercury Press", "1978");
		Book book3 = new Book("The Lord of The Rings", "J.R.R. Tolkien", "Allen & Unwin", "1968");
				
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		book1.setBookInfo("A Dance With Dragons", "George R.R. Martin", "Voyager Books", "2011");
		
		System.out.println(book1.toString());
	}
}
