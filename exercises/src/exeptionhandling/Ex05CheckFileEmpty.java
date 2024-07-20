package exeptionhandling;

import java.io.FileNotFoundException;

import bean.EmptyFileException;
import utils.IOUtils;

public class Ex05CheckFileEmpty {

	public static void main(String[] args) {
		try {
			IOUtils.checkFileNotEmpty("Text.txt");
			System.out.println("File is not empty.");
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (EmptyFileException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
