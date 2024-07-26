package abstraction;

public class Deer extends Animal{

	@Override
	public void sound() {
		System.out.println("Deer bellows!");
	}

	@Override
	public void eat() {
		System.out.println("Deer grazes on grass and leaves.");
	}

	@Override
	public void sleep() {
		System.out.println("Deer sleeps in open fields.");		
	}
	
}
