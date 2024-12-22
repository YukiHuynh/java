package leetcode.array;

public class Problem0169MajorityElement {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
		int candidate = nums[0];
		int count = 0;
		for(int num : nums) {
			if(count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}
		return candidate;
	}
	
}
