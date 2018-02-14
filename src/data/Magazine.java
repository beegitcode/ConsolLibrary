package data;

public class Magazine extends Publication {

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

	public Magazine(String title, int year, String publisher,
			int month, int day, String language) {
		super(year, title, publisher);
		//this.setTitle(title);
		//this.setYear(year);
		//this.setPublisher(publisher);
		this.setMonth(month);
		this.setDay(day);
		this.setLanguage(language);
	}
	public void printInfo() {
        String info = getTitle() + " ; " + getPublisher() + " ; " + getYear() + " ; "
                + getMonth() + " ; " + getDay() + " ; " + getLanguage();
        System.out.println(info);
    }
	
	
	
}
