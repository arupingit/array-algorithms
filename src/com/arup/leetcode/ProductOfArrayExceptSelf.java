package com.arup.leetcode;

import java.util.Arrays;

/**
 * 
 * 
 * 238. Product of Array Except Self
 * 
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 
Follow up: Can you solve the problem in O(1) extra space complexity? 
(The output array does not count as extra space for space complexity analysis.)

 * 
 * 
 * @author arupdutta
 *
 */
public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] i = {1,2,3,4};
		int[] j = {-1,1,0,-3,3};
		System.out.println(Arrays.toString(productExceptSelf(i)));
		System.out.println(Arrays.toString(productExceptSelf(j)));;
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int prefix = 1;
		int postfix = 1;
		
		//set prefix
		result[0] = prefix;
		for(int i=0;i<nums.length-1;i++){
			result[i+1] = prefix*nums[i];
			prefix = result[i+1];
		}
		
		//set postfix
		result[nums.length-1] = result[nums.length-1] * postfix;
		for(int i = nums.length-2;i>=0;i--){
			postfix = nums[i+1]*postfix;
			result[i] = result[i] * postfix;
		}
		
        return result;
    }
}
