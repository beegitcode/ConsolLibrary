package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.Library;

public class FileManager {

	public static final String FILE_NAME = "Library.ira";

	public void writeLibraryToFile(Library lib) {

		try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

		) {
			oos.writeObject(lib);
		} catch (FileNotFoundException e) {
			System.out.println("Nie odnalezion pliku: " + FILE_NAME);
		} catch (IOException e) {
			System.out.println("B��d podczas zapisu danych do pliku: " + FILE_NAME);
		}
	}

	public Library readLibraryFromFile() throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		Library library = null;

		try (FileInputStream fis = new FileInputStream(FILE_NAME); ObjectInputStream ois = new ObjectInputStream(fis);

		) {
			library = (Library) ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku:" + FILE_NAME);
			throw e;
		}catch (IOException e) {
			System.out.println("B��d podczas odczytu danych z pliku: " + FILE_NAME);
			throw e;
		}catch (ClassNotFoundException e) {
			System.out.println("Nieprawid�owy format pliku.");
			throw e;
		}

		return library;

	}

}
