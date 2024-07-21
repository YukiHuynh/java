package exceptionhandling;

import java.io.FileNotFoundException;

import utils.IOUtils;

public class Ex03ReadFile {

	public static void main(String[] args) {
		try {
			IOUtils.readFile("text1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
