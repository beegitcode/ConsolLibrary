package app;

public class LibraryApp {

	public static final String APP_NAME = "Biblioteka v17";

	public static void main(String[] args) {

		System.out.println(APP_NAME);

		LibraryControl libaryControl = new LibraryControl();
		libaryControl.controlLoop();

	}

}
