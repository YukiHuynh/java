package abstraction;

public class Hawk extends Bird{

	@Override
	public void fly() {
		System.out.println("Hawk: Soaring through the air.");
	}

	@Override
	public void makeSound() {
		System.out.println("Hawk: Caw! Caw!");
	}
	
}
