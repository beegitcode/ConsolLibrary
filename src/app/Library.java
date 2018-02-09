package app;

import data.Book;
import utils.DataReader;

public class Library {

	public static void main(String[] args) {
		final String appName = "Biblioteka v14";

		Book[] books = new Book[1000];
		DataReader datareader = new DataReader();

		books[0] = datareader.readAndCreateBook();
		books[1] = datareader.readAndCreateBook();
		datareader.close();

		
		
		System.out.print(appName);
		System.out.println("Ksi¹¿ki dostêpne w bibliotece:");
		books[0].printInfo();
		books[1].printInfo();

		System.out.println("System mo¿e przechowywaæ do: " + books.length  + " publikacji. ");

	}

}
