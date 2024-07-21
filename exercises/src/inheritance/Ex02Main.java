package inheritance;

import bean.Car;
import bean.Vehicle;

public class Ex02Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		vehicle.drive();
		car.drive();
	}
	
}
