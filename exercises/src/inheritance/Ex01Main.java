package inheritance;

import bean.Animal;
import bean.Cat;

public class Ex01Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.makeSound();
		cat.makeSound();
	}
	
}
