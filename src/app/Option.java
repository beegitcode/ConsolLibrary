package app;

public enum Option {
	EXIT(0, " - Wyj�cie."), ADD_BOOK(1, " - Dodaj ksi��k�. "), PRINT_BOOKS(2,
			" - Wy�wietl informacje o wszystkich ksi��kach w bibliotece."), ADD_MAGAZINE(3,
					" - Dodaj Magazyn. "), PRINT_MAGAZINE(4,
							" - Wy�wietl informacje o wszystkich magazynach w bibliotece.");

	int value;
	String description;

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	private Option(int value, String description) {
		this.value = value;
		this.description = description;

	}

	@Override
	public String toString() {
		String desc = value + " " + description;
		return desc;
	}

	public static Option createFromInt(int option) {
		return Option.values()[option];
	}

}
