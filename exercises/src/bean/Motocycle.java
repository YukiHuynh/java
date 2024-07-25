package bean;

public class Motocycle extends Vehicle1{

	private double engineDisplacement;

	public Motocycle() {
		super();
	}

	public Motocycle(String make, String model, int year, String fuelType, double fuelEfficiency, double engineDisplacement) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.engineDisplacement = engineDisplacement;
	}

	public double getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(double engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	@Override
	public double calculateFuelEfficiency() {
		return getEngineDisplacement() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
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
