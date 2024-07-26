package abstraction;

public class Car extends Vehicle{

	@Override
	public void startEngine() {
		System.out.println("Car's engine started!");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car's engine stopped!");
	}
	
}
