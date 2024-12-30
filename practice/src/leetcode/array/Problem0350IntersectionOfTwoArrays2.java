package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem0350IntersectionOfTwoArrays2 {
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		System.out.println(intersection(nums1, nums2).toString());
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> countMap = new HashMap<>();
		List<Integer> resultList = new ArrayList<>();
		
		for(int num : nums1) {
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		for(int num : nums2) {
			if(countMap.containsKey(num) && countMap.get(num) > 0) {
				resultList.add(num);
				countMap.put(num, countMap.get(num)-1);
			}
		}
		int[] result = new int[resultList.size()];
		for(int i = 0; i < resultList.size(); i++) {
			result[i] = resultList.get(i);
		}
		return result;
	}
	
}
