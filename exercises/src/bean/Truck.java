package bean;

public class Truck extends Vehicle1{

	private double cargoCapacity;

	public Truck() {
		super();
	}

	public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.cargoCapacity = cargoCapacity;
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public double calculateFuelEfficiency() {
		return getFuelEfficiency() * (1.0 / (1.0 + getCargoCapacity() / 1000.0));
	}

	@Override
	public double calculateDistanceTravel() {
		return calculateFuelEfficiency() * getFuelEfficiency();
	}

	@Override
	public double getMaxSpeed() {
		return 80.0;
	}
	
	
	
}
