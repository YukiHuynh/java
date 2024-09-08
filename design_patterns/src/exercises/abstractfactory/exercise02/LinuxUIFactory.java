package exercises.abstractfactory.exercise02;

public class LinuxUIFactory extends UIFactory{

	@Override
	public UI createButton() {
		return new Button();
	}

	@Override
	public UI createWindow() {
		return new Window();
	}
	
}
