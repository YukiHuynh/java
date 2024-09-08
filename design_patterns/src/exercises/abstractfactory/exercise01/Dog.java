package exercises.abstractfactory.exercise01;

public class Dog extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog: woof woof!");
	}

	@Override
	public void move() {
		System.out.println("Dog: Running on land.");
	}
	
}
