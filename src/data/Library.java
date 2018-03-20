package data;

import java.io.Serializable;
import java.util.Arrays;

public class Library implements Serializable {

	private static final long serialVersionUID = -1942727499318789886L;

	public static final int INITIAL_CAPACITY = 1;
	private Publication[] publications;
	private int publicationNumber;

	public Library() {

		setPublications(new Publication[INITIAL_CAPACITY]);
	}

	public void addPublication(Publication publicat) throws ArrayIndexOutOfBoundsException {
		if (publicationNumber == publications.length) {

			publications = Arrays.copyOf(publications, publications.length * 2);
		}
		publications[publicationNumber] = publicat;
		publicationNumber++;
	}

	public void addMagazine(Magazine magaz) {
		addPublication(magaz);

	}

	public void addBook(Book boook) {
		addPublication(boook);

	}

	public void removePublication(Publication pub) {
		if (pub == null) {
			return;
		}
		final int NOT_FOUND = -1;
		int found = NOT_FOUND;
		int i = 0;
		while (i < publications.length && found == NOT_FOUND) {
			if (pub.equals(publications[i])) {
				found = i;
			} else {
				i++;
			}
		}

		if (found != NOT_FOUND) {
			System.arraycopy(publications, found + 1, publications, found, publications.length - found - 1);
			publicationNumber--;
		}

	}

	public Publication[] getPublications() {
		return publications;
	}

	public void setPublications(Publication[] publications) {
		this.publications = publications;
	}

	public int getPublicationNumber() {
		return publicationNumber;
	}

	public void setPublicationNumber(int publicationNumber) {
		this.publicationNumber = publicationNumber;
	}

}
