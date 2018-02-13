package app;

import data.Book;
import data.Library;
import utils.DataReader;

public class LibraryControl {

	public static final int EXIT = 0;
	public static final int ADD_BOOK = 1;
	public static final int PRINT_BOOKS = 2;

	DataReader dataReader; // komunikacja z u�ytkownikiem
	Library library; // magazyn danych

	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}

	public void controlLoop() {
		int option;
		printOptions();
		while ((option = dataReader.getInt()) != EXIT) {

			switch (option) {
			case ADD_BOOK:
				addBook();

				break;
			case PRINT_BOOKS:
				printBooks();
				break;
			default:
				System.out.println("Wprowadzono niepoprawn� warto��, spr�buj jeszcze raz.");
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
		System.out.println(EXIT + " - Wyj�cie.");
		System.out.println(ADD_BOOK + " - Dodaj ksi��k�. ");
		System.out.println(PRINT_BOOKS + " - Wy�wietl informacje o wszystkich ksi��kach w bibliotece.");

	}

}
