package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.EmptyFileException;

public class IOUtils {
	private static Scanner ip = new Scanner(System.in);
	
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
	
	public static int  inputInterger() {
		int n;
		System.out.println("Enter an integer:");
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
}
