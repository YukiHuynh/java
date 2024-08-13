package logic;

public class AbbreviateTwoWords {
	
	public static String abbrevName(String name) {
		String[] parts = name.split("\\s+");
		
		if(parts.length != 2) {
			throw new IllegalArgumentException("Input must be exactly two words separated by a space.");
		}
		
		char firstInitial = Character.toUpperCase(parts[0].charAt(0));
		char secondInitial = Character.toUpperCase(parts[1].charAt(0));
		return firstInitial + " " + secondInitial;
	}

}
