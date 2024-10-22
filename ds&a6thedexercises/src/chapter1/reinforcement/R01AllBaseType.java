package chapter1.reinforcement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R01AllBaseType {

	public static void main(String[] args) {
		
		inputAllBaseType();
		
	}
	
	private static Object inputData(String prompt, String type, Scanner ip) {
		System.out.println(prompt);
		switch (type) {
			case "int":
				return ip.nextInt();
			case "short":
				return ip.nextShort();
			case "long":
				return ip.nextLong();
			case "double":
				return ip.nextDouble();
			case "float":
				return ip.nextFloat();
			case "boolean":
				return ip.nextBoolean();
			case "byte":
				return ip.nextByte();
			case "string":
				ip.nextLine();
				return ip.nextLine();
			default:
				throw new IllegalArgumentException("Unsupported data type: " + type);
		}
	}
	
	private static void inputAllBaseType() {
		List<Object> list = new ArrayList<>();
		
		Scanner ip = new Scanner(System.in);
		
		list.add(inputData("Enter a number (int):", "int", ip));
		list.add(inputData("Enter a number (short):", "short", ip));
		list.add(inputData("Enter a number (long):", "long", ip));
		list.add(inputData("Enter a number (double):", "double", ip));
		list.add(inputData("Enter a number (float):", "float", ip));
		list.add(inputData("Enter a number (boolean):", "boolean", ip));
		list.add(inputData("Enter a number (byte)", "byte", ip));
		list.add(inputData("Enter a string:", "string", ip));
		
		list.size();
		
		for(Object element : list) {
			System.out.println(element);
		}
		
		ip.close();
	}
	
}
