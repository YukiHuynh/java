package abstraction;

public class Glockenspiel extends Instrument{

	@Override
	public void play() {
		System.out.println("Glockenspiel: Playing the notes on the metal bars.");
	}

	@Override
	public void tune() {
		System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.");
	}

}
