package data;

import java.util.Iterator;

import utils.DataReader;

public class Library {

	public final int maxBooks = 1000;
	private Book[] books;
	private int booksNumber;

	public Library() {
		books = new Book[maxBooks];
	}

	public Book[] getBooks() {
		return books;
	}

	public int getBooksNumber() {
		return booksNumber;
	}

	public void addBook(Book buk) {
		if (booksNumber < maxBooks) {
			books[booksNumber] = buk;
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
