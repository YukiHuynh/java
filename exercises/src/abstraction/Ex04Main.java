package abstraction;

public class Ex04Main {
	
	public static void main(String[] args) {
		Lion lion = new Lion();
        lion.eat();
        lion.sleep();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        System.out.println();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
	}
	
}
