package exercises.abstractfactory.exercise02;

public class Main {

	public static void main(String[] args) {
		
		UIFactory windowsFactory = new WindowsUIFactory();
		UI windowsButton = windowsFactory.createButton();
		UI windowsWindow = windowsFactory.createWindow();
		windowsButton.render();
		windowsWindow.render();
		
		System.out.println("\n========================\n");
		
		UIFactory macFactory = new MacUIFactory();
		UI macButton = macFactory.createButton();
		UI macWindow = macFactory.createWindow();
		macButton.render();
		macWindow.render();
		
		System.out.println("\n========================\n");
		
		UIFactory linuxFactory = new LinuxUIFactory();
		UI linuxButton = linuxFactory.createButton();
		UI linuxWindow = linuxFactory.createWindow();
		linuxButton.render();
		linuxWindow.render();
		
	}
	
}
