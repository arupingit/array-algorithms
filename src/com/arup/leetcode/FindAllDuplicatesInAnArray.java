package com.arup.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
442. Find All Duplicates in an Array

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.

 * 
 * 
 * @author arupdutta
 *
 */
public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		int[] i = {4,3,2,7,8,2,3,1};
		int[] j = {1,1,2};
		int[] k = {1};
		int[] l = {10,2,5,10,9,1,1,4,3,7};
		System.out.println(Arrays.toString(findDuplicates(i).toArray()));
		System.out.println(Arrays.toString(findDuplicates(j).toArray()));
		System.out.println(Arrays.toString(findDuplicates(k).toArray()));
		System.out.println(Arrays.toString(findDuplicates(l).toArray()));
	}

	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        for(int i=0;i<nums.length;i++){
        	index = Math.abs(nums[i])-1;
        	if(nums[index]<0){
        		result.add(index+1);
        	} else {
        		nums[index] = -1 * nums[index];
        	}
        }
        return result;
    }
}
