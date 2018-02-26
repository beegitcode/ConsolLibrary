package utils;

import data.Book;
import data.Library;
import data.Magazine;
import data.Publication;

public class LibraryUtils {
	
	
	public static void printMagazine(Library lib) {
		Publication[] publications = lib.getPublications();
		int publicationNumber = lib.getPublicationNumber();
		int countMagazines = 0;
		
		for (int i = 0; i < publicationNumber; i++) {
			if (publications[i] instanceof Magazine) {
				System.out.println(publications[i]);
				countMagazines++;
			}

		}
		if (countMagazines == 0) {
			System.out.println("Brak magazynów w bibliotece.");

		}
	}

	public static void printBooks(Library lib) {
		
		Publication[] publications = lib.getPublications();
		int publicationNumber = lib.getPublicationNumber();
		int countBooks = 0;

		for (int i = 0; i < publicationNumber; i++) {
			if (publications[i] instanceof Book) {
				System.out.println(publications[i]);
				countBooks++;
			}

		}
		if (countBooks == 0) {
			System.out.println("Brak ksi¹¿ek w biblitece.");

		}
	}
}
