package basicpart;

public class B1Ex11 {
	// r = 7.5
	// Diện tích hình tròn A = Pi * r^2;
	// Chu vi của hình trong C = 2*pi*r
	public static void main(String[] args) {
		double r = 7.5;
		double a = Math.PI * Math.pow(r, 2.0);
		double c = 2 * Math.PI * r;
		
		System.out.println("Area: " + a);
		System.out.println("Perimeter: " + c);
	}
	
}
