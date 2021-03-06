package data;

public class Magazine extends Publication {

	private static final long serialVersionUID = -5035046643315267073L;

	private int month;
	private int day;
	private String language;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Magazine(String title, int year, String publisher, int month, int day, String language) {
		super(year, title, publisher);
		this.setMonth(month);
		this.setDay(day);
		this.setLanguage(language);
	}

	@Override
	public String toString() {
		StringBuilder print = new StringBuilder(32);
		print.append(getTitle());
		print.append(" ;");
		print.append(getPublisher());
		print.append(" ;");
		print.append(getYear());
		print.append(" ;");
		print.append(getMonth());
		print.append(" ;");
		print.append(getYear());
		print.append(" ;");
		print.append(getDay());
		print.append(" ;");
		print.append(getLanguage());

		return print.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + day;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + month;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (day != other.day)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (month != other.month)
			return false;
		return true;
	}

}
