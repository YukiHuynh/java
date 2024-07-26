package abstraction;

public class Motorcycle extends Vehicle{

	@Override
	public void startEngine() {
		System.out.println("Motorcycle's engine started!");
	}

	@Override
	public void stopEngine() {
		System.out.println("Motorcycle's engine stopped!");
	}
	
}
