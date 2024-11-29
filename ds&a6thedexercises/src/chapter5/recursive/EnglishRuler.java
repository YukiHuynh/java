package chapter5.recursive;

public class EnglishRuler {

	public static void main(String[] args) {
		drawRuler(2, 5);
	}
	
	public static void drawRuler(int nInches, int majorLength) {
		drawLine(majorLength, 0);
		for(int i = 1; i <= nInches; i++) {
			drawInterval(majorLength - 1);
			drawLine(majorLength, i);
		}
	}
	
	private static void drawInterval(int centralLenth) {
		if(centralLenth >= 1) {
			drawInterval(centralLenth - 1);
			drawLine(centralLenth);
			drawInterval(centralLenth - 1);
		}
	}
	
	private static void drawLine(int tickLength, int tickLable) {
		for(int i = 0; i < tickLength; i++) {
			System.out.print("-");
		}
		if(tickLable >= 0) {
			System.out.print(" " + tickLable);
		}
		System.out.print("\n");
	}
	
	private static void drawLine(int tickLength) {
		drawLine(tickLength, -1);
	}
	
}
