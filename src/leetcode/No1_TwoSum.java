package leetcode;

import java.util.HashMap;

public class No1_TwoSum {
	public static void main(String[] args) {
		// edit input and output here
		
		int[] input = new int[5];
		input[0] = 3;
		input[1] = 1;
		input[2] = 6;
		input[3] = 4;
		input[4] = 8;
		
		int target = 5;
		
		int[] result = twoSum(input, target);
		
		System.out.println("Result of this problem is: ");
		System.out.print(result[0] + ", " + result[1]);
	}
	
	/*
	 * Use hashmap to store visited numbers and their indices
	 * 06-18-2019
	 */
	public static int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2) return new int[2];
		
		HashMap<Integer, Integer> mymap = new HashMap<Integer, Integer>();
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (mymap.containsKey(nums[i])) {
				ans[0] = mymap.get(nums[i]);
				ans[1] = i;
				break;
			} else {
				mymap.put(target - nums[i], i);
			}
		}
		
		return ans;
	}
	
}
