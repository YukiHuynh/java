package exceptionhandling;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.DupblicateNumberException;
import utils.IOUtils;

public class Ex06CheckDuplicateNumber {

	public static void main(String[] args) {
		try {
			List<Integer> numbers = IOUtils.readNumberFromUser();
			checkDuplicates(numbers);
			System.out.println("No duplicate number!");
		} catch (DupblicateNumberException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void checkDuplicates(List<Integer> number) throws DupblicateNumberException {
		Set<Integer> uniqueNumbers = new HashSet< >();
		for(int num: number) {
			if(uniqueNumbers.contains(num)) {
				throw new DupblicateNumberException ("Duplicate number found: " + num);
			}
			uniqueNumbers.add(num);
		}
	}
	
}
