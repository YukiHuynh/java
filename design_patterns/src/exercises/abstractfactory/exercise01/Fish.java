package exercises.abstractfactory.exercise01;

public class Fish extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Fish: Blub Blub!");
	}

	@Override
	public void move() {
		System.out.println("Fish: Swimming in watter.");
	}

}
