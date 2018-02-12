package app;

public class LibraryApp {

	public static void main(String[] args) {
		final String appName = "Biblioteka v15";
		System.out.println(appName);
		
		LibraryControl libaryControl = new LibraryControl();
		libaryControl.coontrolLoop();
		
		
	}
	
}
