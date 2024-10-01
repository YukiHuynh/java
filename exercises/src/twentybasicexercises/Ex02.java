package twentybasicexercises;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter an integer: ");

		while (true) {
			if (ip.hasNextInt()) {
				int number = ip.nextInt();
				String words = convertToWords(number);
				System.out.println("Số " + number + " được đọc là: " + words);
			} else {
				System.out.println("Invalid input. Please enter an integer.");
				ip.nextLine();
			}
		}
	}
	
	private static final String[] units = { 
			"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" 
			};

	private static final String[] tens = { 
			"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi",
			"bảy mươi", "tám mươi", "chín mươi" 
			};

	private static String convertToWords(int number) {
	    if (number == 0) return "không";

	    StringBuilder words = new StringBuilder();
	    if (number < 0) {
	        words.append("âm ");
	        number = -number;
	    }

	    if (number < 10) {
	        words.append(units[number]);
	    } else if (number < 100) {
	        words.append(tens[number / 10]);
	        appendUnits(words, number % 10, number / 10);
	    } else if (number < 1000) {
	        words.append(units[number / 100]).append(" trăm");
	        if (number % 100 != 0) {
	            words.append(" ");
	            if ((number / 10) % 10 == 0) {
	                words.append("linh ");
	            } else {
	                words.append(tens[(number / 10) % 10]).append(" ");
	            }
	            appendUnits(words, number % 10, (number / 10) % 10);
	        } else if (number % 10 != 0) {
	            words.append(" linh ").append(units[number % 10]);
	        }
	    }

	    return words.toString().trim();
	}
    
    private static void appendUnits(StringBuilder words, int unitDigit, int tensDigit) {
    	if(unitDigit > 0) {
    		if(unitDigit == 1 && tensDigit != 1) {
    			words.append(" mốt");
    		} else if (unitDigit == 5 && tensDigit != 0) {
    			words.append(" lăm");
    		} else {
    			words.append(" ").append(units[unitDigit]);
    		}
    	}
    }
}
