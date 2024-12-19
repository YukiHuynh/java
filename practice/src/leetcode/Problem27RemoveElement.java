package leetcode;

public class Problem27RemoveElement {

	public int removeElement(int[] nums, int val) {
		if(nums.length == 0) return 0;
		int numCount = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[numCount++] = nums[i];
			}
		}
		return numCount;
	}
	
}
