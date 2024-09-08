package exercises.abstractfactory.exercise01;

public class Main {

	public static void main(String[] args) {
		AnimalFactory landFactory = new LandAnimalFactory();
		Animal landAnimal = landFactory.createLandAnimal();
		landAnimal.makeSound();
		landAnimal.move();
		
		System.out.println("\n========================\n");
		
		AnimalFactory waterFactory = new WaterAnimalFactory();
		Animal waterAnimal = waterFactory.createWaterAnimal();
		waterAnimal.makeSound();
		waterAnimal.move();
	}
	
}
