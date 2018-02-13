package app;

public class LibraryApp {

	public static final String APP_NAME = "Biblioteka v15";

	public static void main(String[] args) {

		System.out.println(APP_NAME);

		LibraryControl libaryControl = new LibraryControl();
		libaryControl.controlLoop();

	}

}
