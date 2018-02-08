package data;

public class Book {

		private String title;
	    private String author;
	    int releaseDate;
	    int pages;
	    String publisher;
	    String isbn;
	
	    
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
			
			this.setTitle(title);
			this.setAuthor(author);
			this.releaseDate = releaseDate;
			this.pages = pages;
			this.publisher = publisher;
			this.isbn = isbn;
		}
		
		Book(Book book){
			this(book.getTitle(), book.getAuthor(), book.releaseDate, book.pages, book.publisher, book.isbn);
		}


		public void printInfo() {
			String info = getTitle() + "; " + getAuthor() + "; " + releaseDate + "; " + pages + "; " + publisher
	                + "; " + isbn;
	        System.out.println(info);
			
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
}
