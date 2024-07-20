package eenum;
public class Main {
	
	public static void main(String[] args) {
		DaysOfWeek today = DaysOfWeek.MONDAY;
		System.out.println("Today is " + today);
		
		System.out.println("===============");
		
		Weekends day1 = Weekends.SATURDAY;
		Weekends day2 = Weekends.SUNDAY;
		System.out.println("First day of the weekends: " + day1);
		System.out.println("Second day of the weekends: " + day2);
		
		System.out.println("===============");
		
		Shapes shape1 = Shapes.CIRCLE;
		Shapes shape2 = Shapes.SQUARE;
		System.out.println("First shape: " + shape1);
		System.out.println("Second shape: " + shape2);
	}
	
	public enum DaysOfWeek {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	}
	
	public enum Weekends {
		SATURDAY, SUNDAY
	}
	
	public enum Shapes {
		SQUARE, CIRCLE, RECTANGLE, TRIANGLE, HEXAGON
	}
	
}
