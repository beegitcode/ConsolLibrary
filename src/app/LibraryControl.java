package app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import data.Book;
import data.Library;
import data.Magazine;
import utils.DataReader;
import utils.LibraryUtils;

public class LibraryControl {

	DataReader dataReader; // komunikacja z u¿ytkownikiem
	Library library; // magazyn danych

	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}

	public void controlLoop() {
		Option option = null;
		while (option != Option.EXIT) {
			try {
				printOptions();
				option = Option.createFromInt(dataReader.getInt());
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
				case EXIT:
					;
				}
			} catch (InputMismatchException e) {
				System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano. ");
			} catch (NoSuchElementException e) {
				System.out.println("Wybrana opcja nie istnieje spróbuj ponownie. ");
			}
		}
		dataReader.close();
	}

	private void printBooks() {
		LibraryUtils.printBooks(library);
	}

	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}

	private void printMagazines() {
		LibraryUtils.printMagazine(library);
	}

	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}

	public void printOptions() {
		System.out.println("Wybierz opcjê: ");
		for (Option option : Option.values()) {
			System.out.println(option);
		}

	}

}
