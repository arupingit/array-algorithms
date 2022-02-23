package com.arup.leetcode;

import java.util.HashSet;

/**
 * 217. Contains Duplicate
 * 
 * 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 * 
 * 
 * @author arupdutta
 *
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] i = {1,2,3,1};
		int[] j = {1,2,3,4};
		int[] k = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(i));
		System.out.println(containsDuplicate(j));
		System.out.println(containsDuplicate(k));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> checkDup = new HashSet();
		for(int i=0;i<nums.length;i++){
			if(checkDup.contains(nums[i])){
				return true;
			}
			checkDup.add(nums[i]);
		}
		return false; 
    }

}
