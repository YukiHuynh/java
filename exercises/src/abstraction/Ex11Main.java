package abstraction;

public class Ex11Main {
	
	public static void main(String[] args) {
		Bird eagle = new Eagle();
		Bird hawk = new Hawk();
		
		eagle.fly();
		eagle.makeSound();
		hawk.fly();
		hawk.makeSound();
	}
	
}
