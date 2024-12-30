package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Problem0228SummaryRanges {

	public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        
        if(nums == null || nums.length == 0) {
        	return ranges;
        }
        
        int start = nums[0];
        int end = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] == nums[i-1] + 1) {
        		end = nums[i];
        	} else {
        		ranges.add(formatRange(start, end));
        		start = nums[i];
        		end = nums[i];
        	}
        }
        ranges.add(formatRange(start, end));
        return ranges;
        
    }
	
	private static String formatRange(int start, int end) {
		return start == end ? String.valueOf(start) : start + "->" + end;
	}
	
}
