package oop;

import bean.Circle;
import bean.Dog;
import bean.Person;
import bean.Rectangle;

public class Ex01ToEx04 {

	public static void main(String[] args) {
		// Ex01
		Person person1 = new Person("Nguyen", 29);
		Person person2 = new Person("Yuki", 30);
		
		System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
		System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
		
		person1.setAge(31);
		person2.setName("Vince");
		System.out.println(person1.getName() + " is " + person1.getAge() + " now years old.");
		System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
		System.out.println("=============================================================\n");
		
		// Ex02
		Dog dog1 = new Dog("Mia", "Boston");
		Dog dog2 = new Dog("Jack", "German shepherds");
		System.out.println(dog1.getName() + " is a " + dog1.getBreed());
		System.out.println(dog2.getName() + " is a " + dog2.getBreed());
		
		dog1.setName("Luna");
		dog1.setBreed("Labrador");
		dog2.setName("Jacob");
		dog2.setBreed("Domain terrier");
		System.out.println("\nAfter change attribute:\n");
		System.out.println(dog1.getName() + " is a " + dog1.getBreed());
		System.out.println(dog2.getName() + " is a " + dog2.getBreed());
		System.out.println("=============================================================\n");
		
		Rectangle rectangle = new Rectangle(22, 40);
		int p = (rectangle.getWidth() + rectangle.getHeight()) * 2;
		int s = rectangle.getWidth() * rectangle.getHeight();
		System.out.println("Perimiter of rectangle with width: " + rectangle.getWidth() + " and height: " 
				+ rectangle.getHeight() + " is " + p);
		System.out.println("Area of rectangle with width: " + rectangle.getWidth() + " and height: " 
					+ rectangle.getHeight() + " is " + s);
		System.out.println("=============================================================\n");
		
		Circle circle = new Circle(15);
		double cC = 2 * Math.PI * circle.getRadius();
		double sC = Math.PI * Math.pow(circle.getRadius(), 2);
		System.out.println("Circumference of circle with radius " + circle.getRadius() + " is " + cC);
		System.out.println("Area of circle with radius " + circle.getRadius() + " is " + sC);
		
	}
	
}
