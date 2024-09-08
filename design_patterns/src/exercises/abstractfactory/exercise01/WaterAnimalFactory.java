package exercises.abstractfactory.exercise01;

public class WaterAnimalFactory extends AnimalFactory{

	@Override
	public Animal createLandAnimal() {
		return null;
	}

	@Override
	public Animal createWaterAnimal() {
		return new Fish();
	}

}
