package abstraction;

public class Ex08Main {

	public static void main(String[] args) {
		Person athlete = new Athlete();
		Person lazyPerson = new LazyPerson();
		
		athlete.eat();
		athlete.exercise();
		lazyPerson.eat();
		lazyPerson.exercise();
	}
	
}
