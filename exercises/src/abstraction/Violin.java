package abstraction;

public class Violin extends Instrument{

	@Override
	public void play() {
		System.out.println("Violin: Playing the strings with a bow or fingers.");
	}

	@Override
	public void tune() {
		System.out.println("Violin: Tuning the strings to the correct pitch.");
	}

}
