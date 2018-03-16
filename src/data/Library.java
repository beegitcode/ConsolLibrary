package data;

import java.io.Serializable;

public class Library implements Serializable{

	private static final long serialVersionUID = -1942727499318789886L;

	public static final int MAX_PUBLICATIONS = 2000;

	private Publication[] publications;
	private int publicationNumber;

	

	public Library() {

		setPublications(new Publication[MAX_PUBLICATIONS]);
	}

	public void addPublication(Publication publicat) throws ArrayIndexOutOfBoundsException {
		if (getPublicationNumber() == MAX_PUBLICATIONS) {
			throw new ArrayIndexOutOfBoundsException("MAX_PUBLICATIONS " + MAX_PUBLICATIONS);
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
