package data;

public class Library {

	public static final int MAX_BOOKS = 1000;
	private Book[] books;
	private int booksNumber;

	public Library() {
		books = new Book[MAX_BOOKS];
	}

	public Book[] getBooks() {
		return books;
	}

	public int getBooksNumber() {
		return booksNumber;
	}

	public void addBook(Book boook) {
		if (booksNumber < MAX_BOOKS) {
			books[booksNumber] = boook;
			booksNumber++;
		} else {
			System.out.println("Brak miejsca w systemie");
		}

	}

	public void printBooks() {
		if (booksNumber == 0) {
			System.out.println("Brak ksi¹¿ek w systemie");
		}
		for (int i = 0; i < booksNumber; i++) {
			books[i].printInfo();
		}

	}

}
