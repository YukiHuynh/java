package abstraction;

public class LazyPerson extends Person{

	@Override
	public void eat() {
		System.out.println("Couch Potato: Eating while watching TV also prolongs the time period that we're eating.");
	}

	@Override
	public void exercise() {
		System.out.println("Couch Potato: Rarely exercising or being physically active");
	}

}
