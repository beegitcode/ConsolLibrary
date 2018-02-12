package app;

import data.Book;
import data.Library;
import utils.DataReader;

public class LibraryControl {

	public final int exit = 0;
	public final int addBook = 1;
	public final int printBooks = 2;

	// komunikcja z u¿ytkownikiem
	private DataReader dataReader;
	// zmienna do przechowywania danych
	private Library library;

	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}

	public void coontrolLoop() {

		int option;
		printOptions();
		while ((option = dataReader.getInt()) != exit) {

			switch (option) {
			case exit:
				System.out.println("Dozobaczenia. ");
				break;
			case addBook:
				addBook();
				break;
			case printBooks:
				printBooks();
				break;
			default:
				System.out.println("Nie ma takiej opcji, wprowadŸ ponownie: ");
				break;
			}
			printOptions();
		}
		dataReader.close();
	}

	private void printBooks() {
		library.printBooks();
	}

	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);

	}

	public void printOptions() {
		System.out.println(exit + " - Wyjœcie.");
		System.out.println(addBook + " - Dodaj ksi¹¿kê. ");
		System.out.println(printBooks + " - wyœwietl informacje o wszystkich ksi¹¿kach w bibliotece.");

	}

}
