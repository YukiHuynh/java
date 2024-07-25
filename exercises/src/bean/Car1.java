package bean;

public class Car1 extends Vehicle1{

	private int numSeat;

	public Car1() {
		super();
	}

	public Car1(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeat) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.numSeat = numSeat;
	}

	public int getNumSeat() {
		return numSeat;
	}

	public void setNumSeat(int numSeat) {
		this.numSeat = numSeat;
	}

	@Override
	public double calculateFuelEfficiency() {
		return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeat() /5.0)));
	}

	@Override
	public double calculateDistanceTravel() {
		return calculateFuelEfficiency() * getFuelEfficiency();
	}

	@Override
	public double getMaxSpeed() {
		return 120.0;
	}
	
	
	
}
