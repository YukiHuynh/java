package abstraction;

public class Eagle extends Bird{

	@Override
	public void fly() {
		System.out.println("Eagle: Flying high in the sky.");
	}

	@Override
	public void makeSound() {
		System.out.println("Eagle: Screech! Screech!");
	}
	
}
