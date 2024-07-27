package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04EvenOddFilter {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
		
		System.out.println("Original numbers: ");
		for (int n : nums) {
            System.out.print(n+ " ");
        }
		
		List<Integer> evenNumbers = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.print("\nEven numbers: ");
		for(int num : evenNumbers) {
			System.out.print(num + " ");
		}
		
		List<Integer> oddNumbers = nums.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.print("\nOdd numbers: ");
		for (int num : oddNumbers) {
			System.out.print(num + " ");
		}
		
	}
	
}
