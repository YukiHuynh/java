package inheritance;

import bean.Car1;
import bean.Motocycle;
import bean.Truck;

public class Ex09Main {

	public static void main(String[] args) {
		
		Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.6);
		Car1 car = new Car1("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
		Motocycle motocycle = new Motocycle("Massio Motor", "Warrior 200", 2018, "GASOLINE", 2.1, 7.5);
		
		System.out.println("Truck model: " + truck.getModel());
		System.out.println("Fuel efficiency: " + truck.calculateFuelEfficiency() + " mpg");
		System.out.println("Distance traveled: " + truck.calculateDistanceTravel() + " miles");
		System.out.println("Max speed: " + truck.getMaxSpeed() + " mpg\n");
		
		System.out.println("============================================");
		System.out.println("Car model: " + car.getModel());
		System.out.println("Feul efficiency: " + car.calculateFuelEfficiency() + " mpg");
		System.out.println("Distance traveled: " + car.calculateDistanceTravel() + " miles");
		System.out.println("Max speed: " + car.getMaxSpeed() + " mpg\n");
		
		System.out.println("============================================");
		System.out.println("Motocycle model: " + motocycle.getModel());
		System.out.println("Fuel efficiency: " + motocycle.calculateFuelEfficiency() + " mpg");
		System.out.println("Distance traveled: " + motocycle.calculateDistanceTravel() + " miles");
		System.out.println("Max speed: " + motocycle.getMaxSpeed() + " mpg\n");
		
	}
	
}
