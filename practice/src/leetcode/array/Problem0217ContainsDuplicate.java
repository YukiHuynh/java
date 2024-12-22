package leetcode.array;

import java.util.HashSet;

public class Problem0217ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(containDuplicate(nums));
	}
	
	public static boolean containDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}
	
}
