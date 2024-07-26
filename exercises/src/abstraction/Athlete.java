package abstraction;

public class Athlete extends Person{

	@Override
	public void eat() {
		System.out.println("Athlete: Include foods full of calcium, iron, potassium, and fiber.");
	}

	@Override
	public void exercise() {
		System.out.println("Athlete: Training allows the body to gradually build up strength and "
				+ "endurance, improve skill levels and build motivation, ambition and confidence.");
	}

}
