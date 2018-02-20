package data;

public class Library {

	public static final int MAX_PUBLICATIONS = 2000;
	public static final int MAX_MAGAZINES = 1000;

	private Publication[] publications;
	private int publicationNumber;

	// private Magazine[] magazines;
	// private int magazinesNumber;

	public Library() {

		publications = new Publication[MAX_PUBLICATIONS];
	}


	public void addPublication(Publication publicat) {
		if (publicationNumber < MAX_PUBLICATIONS) {
			publications[publicationNumber] = publicat;
			publicationNumber++;
		} else {
			System.out.println("Brak miejsca w systemie");
		}
	}

	public void addMagazine(Magazine magaz) {
		addPublication(magaz);

	}

	public void addBook(Book boook) {
		addPublication(boook);

	}

	public void printMagazine() {
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

	public void printBooks() {
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
