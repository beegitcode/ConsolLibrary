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

	private enum Option {
		EXIT(0, " - Wyjœcie."), ADD_BOOK(1, " - Dodaj ksi¹¿kê. "), PRINT_BOOKS(2,
				" - Wyœwietl informacje o wszystkich ksi¹¿kach w bibliotece."), ADD_MAGAZINE(3,
						" - Dodaj Magazyn. "), PRINT_MAGAZINE(4,
								" - Wyœwietl informacje o wszystkich magazynach w bibliotece.");

		int value;
		String description;

		private Option(int value, String description) {
			this.value = value;
			this.description = description;

		}

		@Override
		public String toString() {
			String desc = value + " " + description;
			return desc;
		}

		public static Option createFromInt(int option) throws NoSuchElementException {
			Option result = null;
			try {
				result = Option.values()[option];
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new NoSuchElementException("Brak elementu o wskazanym ID " + option);
			}
			return result;
		}

	}
}
