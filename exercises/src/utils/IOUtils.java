package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import bean.EmptyFileException;

public class IOUtils {
	private static Scanner ip = new Scanner(System.in);
	
	public static int triangleSide(String prompt, Scanner ip) {
		int side;
        while (true) {
            System.out.println(prompt);
            try {
                side = ip.nextInt();
                if (side > 0) {
                    return side;
                } else {
                    System.out.println("Input must be a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                ip.next(); // Clear the invalid input
            }
        }
    }
	
	public static int checkInteger() {
		int n = 0;
		System.out.println("Input an integer:");
		while (true) {
			if (ip.hasNextInt()) {
				n = ip.nextInt();
				if (n > 0) {
					System.out.println(n + " là số nguyên dương.");
				} else {
					System.out.println(n + " là số nguyên âm.");
				}
			} else {
				System.out.println("Invalid Input.");
				ip.nextLine();
			}
		}
	}
	
	public static DivideValues inputValues() {
		System.out.println("Enter dividend:");
        while (!ip.hasNextInt()) {
            System.out.println("Invalid dividend.");
            ip.next();
        }
        int dividend = ip.nextInt();

        System.out.println("Enter divisor:");
        while (!ip.hasNextInt()) {
            System.out.println("Invalid divisor.");
            ip.next();
        }
        int divisor = ip.nextInt();
        
        return new DivideValues(dividend, divisor);
	}
	
	public static int inputInteger(String message) {
		int n;
		System.out.println(message);
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if( n > 0) {
					break;
				} else {
					System.out.println("Invalid input.");
					ip.next();
				}
			}
		}
		return n;
	}
	
	public static void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner ipF= new Scanner(file);
		
		while(ipF.hasNextLine()) {
			String line = ipF.nextLine();
			System.out.println(line);
		}
		
		ipF.close();
	}
	
	public static void checkFileNotEmpty (String fileName) throws FileNotFoundException, EmptyFileException {
		File file = new File(fileName);
		Scanner ipF = new Scanner(file);
		
		if(!ipF.hasNextLine()) {
			ipF.close();
			throw new EmptyFileException("File is empty.");
		}
		
		ipF.close();
	}
	
	// 
	public static List<Integer> readNumberFromUser() {
		List <Integer> numbers = new ArrayList< >();
		
		System.out.println("How many number you want to imput?");
		int count = ip.nextInt();
		
		System.out.println("Input intergers: ");
		for(int i = 0; i < count; i++) {
			int num = ip.nextInt();
			numbers.add(num);
		}
		ip.close();
		return numbers;
	}
	
	// Input a sentence from the user, this sentence cannot be empty
	public static String inputSentence () {
		System.out.println("Input a sentence: ");
		String text = ip.nextLine();
		while(true) {
			if(text.isEmpty()) {
				break;
			} else {
				System.out.println("Invalid input!");
				ip.next();
			}
		}
		return text;
	}
	
	// Input an array of integers from the user
	public static int[] IntegerArrayInput() {
		System.out.println("Enter numbers of integer array: ");
		int intSize = ip.nextInt();
		
		int[] intArray = new int[intSize];
		System.out.println("Input array's elements: ");
		
		for(int i = 0; i < intSize; i++) {
			while(true) {
				try {
					intArray[i] = ip.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Invalid input! Please enter an INTEGER.");
					ip.next();
				}
			}
		}
		return intArray;
		
	}
	
	// Input and array of strings from the user
	public static String[] StringArrayInput() {
		System.out.println("Enter numbers of string array: ");
		int strSize = ip.nextInt();
		ip.nextLine();
		
		System.out.println("Input array's elements: ");
		String[] strArray = new String[strSize];
		for(int i = 0; i < strSize; i++) {
			while(true) {
				String input = ip.nextLine();
				if(!input.trim().isEmpty()) {
					strArray[i] = input;
					break;
				} else {
					System.out.println("Invalid input! String cannot be empty!");
				}
				
			}
		}
		return strArray;
		
	}
	
	// Random an array of integer from 0 to 99
	public static int[] randomArray() {
		int n = inputInteger("Enter number of elements to random:");
		int[] array = new int[n];
		Random rd = new Random();
		
		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(100);
		}
		return array;
	}
	
}
