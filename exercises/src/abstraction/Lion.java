package abstraction;

public class Lion extends Animal{

	@Override
	public void sound() {
		System.out.println("Lion roars!");
	}

	@Override
	public void eat() {
		System.out.println("Lion eats meat.");
	}

	@Override
	public void sleep() {
		System.out.println("Lion sleeps on grassland.");
	}

}
