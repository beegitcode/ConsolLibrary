package data;

public class Book extends Publication {

	private String author;
	private int pages;
	private String isbn;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book(String title, String author, int year, int pages, String publisher, String isbn) {
		super(year, title, publisher);
		//this.setTitle(title);
		this.setAuthor(author);
		//this.setYear(year);
		this.setPages(pages);
		//this.setPublisher(publisher);
		this.setIsbn(isbn);
	}

	Book(Book book) {
		this(book.getTitle(), book.getAuthor(), book.getYear(), book.getPages(), book.getPublisher(),
				book.getIsbn());
	}

	public void printInfo() {
		String info = getTitle() + "; " + getAuthor() + "; " + getYear() + "; " + getPages() + "; "
				+ getPublisher() + "; " + getIsbn();
		System.out.println(info);

	}

}
