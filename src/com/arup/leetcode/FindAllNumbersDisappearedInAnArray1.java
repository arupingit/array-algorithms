package com.arup.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
448. Find All Numbers Disappeared in an Array

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] 
that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 
Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 
Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 * @author arupdutta
 *
 */
public class FindAllNumbersDisappearedInAnArray1 {

	public static void main(String[] args) {
		int[] i = {4,3,2,7,8,2,3,1};
		int[] j = {1,1};
		System.out.println(Arrays.toString(findDisappearedNumbers(i).toArray()));
		System.out.println(Arrays.toString(findDisappearedNumbers(j).toArray()));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		int index;
        for(int i=0;i<nums.length;i++){
        	index = (java.lang.Math.abs(nums[i])-1);
        	nums[index] = (java.lang.Math.abs(nums[index])*-1);
        }
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>0){
        		result.add(i+1);
        	}
        }
		return result;
    }
}
