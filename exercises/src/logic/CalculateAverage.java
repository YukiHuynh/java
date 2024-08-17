package logic;

public class CalculateAverage {

	public static void main(String[] args) {
		
		int[] array = {1, 3, 5, 8, 12, 59};
		System.out.println(findAverage(array));
		
		String input = "HelloWorld";
        String[] parts = input.split("\\p{Lu}");
        // String result = String.join(" ", parts); // Join the parts with a space
        System.out.println(parts.toString());
		
	}
	
	public static double findAverage(int[] array){
	    int sum = 0;
	    double avg = 0;
	    int count = 0;
	    if(array.length == 0) {
	      avg = 0;
	    } else {
	        for(int element : array){
	        sum += element;
	        count++;
	        }
	      avg = (double) sum / count;
	    }
	    return avg;
	  }
	
}
