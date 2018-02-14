package data;

public class Library {

	public static final int MAX_BOOKS = 1000;
	public static final int MAX_MAGAZINES = 1000;

	private Book[] books;
	private int booksNumber;

	private Magazine[] magazines;
	private int magazinesNumber;

	public Library() {
		books = new Book[MAX_BOOKS];
		magazines = new Magazine[MAX_MAGAZINES];
	}

	public Book[] getBooks() {
		return books;
	}

	public int getBooksNumber() {
		return booksNumber;
	}

	public Magazine[] getMagazines() {
		return magazines;
	}

	public int getMagazinesNumber() {
		return magazinesNumber;
	}

	public void addMagazine(Magazine magaz) {
		if (magazinesNumber < MAX_MAGAZINES) {
			magazines[magazinesNumber] = magaz;
			magazinesNumber++;
		} else {
			System.out.println("Brak miejsca na magazyny");
		}

	}

	public void addBook(Book boook) {
		if (booksNumber < MAX_BOOKS) {
			books[booksNumber] = boook;
			booksNumber++;
		} else {
			System.out.println("Brak miejsca na ksi¹¿ki w systemie");
		}

	}

	public void printMagazine() {
		if (magazinesNumber == 0) {
			System.out.println("Brak magazynów w systemie");
		}
		for (int i = 0; i < magazinesNumber; i++) {
			magazines[i].printInfo();
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
