package abstraction;

public class Ex07Main {
	
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();
		
		car.startEngine();
		car.stopEngine();
		motorcycle.startEngine();
		motorcycle.stopEngine();
		
	}
	
}
