package leetcode.array;

import java.util.HashSet;

public class Problem0136SingleNumber {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		HashSet<Integer> uniqueNumber = new HashSet<>();
		int sumOfAll = 0;
		int sumOfUnique = 0;
		
		for(int num : nums) {
			sumOfAll += num;
			if(!uniqueNumber.contains(num)) {
				uniqueNumber.add(num);
				sumOfUnique += num;
			}
		}
		return 2 * sumOfUnique - sumOfAll;
	}
	
}
