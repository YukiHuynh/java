package bean;
import java.util.ArrayList;
public class Book {
	private String title;
	private String author;
	private String iSBN;
	private static ArrayList<Book> bookCollection = new ArrayList<Book>();

	public Book() {
	}

	public Book(String title, String author, String iSBN) {
		this.title = title;
		this.author = author;
		this.iSBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public static void addBook(Book book) {
        bookCollection.add(book);
	}
	
	public static void removeBook(Book book) {
		bookCollection.remove(book);
	}
	
	public static ArrayList<Book> getBookCollection() {
		return bookCollection;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", iSBN=" + iSBN + "]";
	}
	
}
