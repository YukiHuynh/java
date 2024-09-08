package exercises.abstractfactory.exercise01;

public class LandAnimalFactory extends AnimalFactory{

	@Override
	public Animal createLandAnimal() {
		return new Dog();
	}

	@Override
	public Animal createWaterAnimal() {
		return null;
	}

	
	
}
