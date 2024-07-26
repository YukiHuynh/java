package abstraction;

public class Ex09Main {

	public static void main(String[] args) {
		Instrument glockenspiel = new Glockenspiel();
		Instrument violin = new Violin();
		
		glockenspiel.play();
		glockenspiel.tune();
		violin.play();
		violin.tune();
	}
	
}
