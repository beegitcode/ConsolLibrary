package app;

import data.Book;
import data.Library;
import data.Magazine;
import utils.DataReader;

public class LibraryControl {

	public static final int EXIT = 0;
	public static final int ADD_BOOK = 1;
	public static final int PRINT_BOOKS = 2;
	public static final int ADD_MAGAZINE = 3;
	public static final int PRINT_MAGAZINE = 4;

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
			case ADD_MAGAZINE:
				addMagazine();
				break;
			case PRINT_MAGAZINE:
				printMagazines();
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

	private void printMagazines() {
		library.printMagazine();
	}

	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}

	public void printOptions() {
		System.out.println("Wybierz opcj�: ");
		System.out.println(EXIT + " - Wyj�cie.");
		System.out.println(ADD_BOOK + " - Dodaj ksi��k�. ");
		System.out.println(PRINT_BOOKS + " - Wy�wietl informacje o wszystkich ksi��kach w bibliotece.");
		System.out.println(ADD_MAGAZINE + " - Dodaj Magazyn. ");
		System.out.println(PRINT_MAGAZINE + " - Wy�wietl informacje o wszystkich magazynach w bibliotece.");

	}

}
