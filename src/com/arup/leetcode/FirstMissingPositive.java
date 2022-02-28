package com.arup.leetcode;

/**
 * 
41. First Missing Positive

Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

 

Example 1:
Input: nums = [1,2,0]
Output: 3

Example 2:
Input: nums = [3,4,-1,1]
Output: 2

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1

 * 
 * @author arupdutta
 *
 */
public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] i = {1,2,0};
		int[] j = {3,4,-1,1};
		int[] k = {7,8,9,11,12};
		System.out.println(firstMissingPositive(i));
		System.out.println(firstMissingPositive(j));
		System.out.println(firstMissingPositive(k));
	}

	//Marking the data with negative flag 
	public static int firstMissingPositive(int[] nums) {
		int smallestPositive;
		int index;
		
		//Set all values less than 0 to Array out of bound value
		for(int i=0;i<nums.length;i++){
			if(nums[i]<1){
				nums[i] = nums.length + 1;
			}
		}
		
		//Mark values of indexes to negative incase the index is present in array 
		for(int i=0;i<nums.length;i++){
			index = Math.abs(nums[i])-1;
			if(index<nums.length && nums[index]>0){
				nums[index] = -nums[index];
			}
		}
		
		//Find the smallest index where value is positive
		for(smallestPositive = 1;smallestPositive<=nums.length;smallestPositive++){
			if(nums[smallestPositive-1]>0){
				break;
			}
		}
		
        return smallestPositive;
    }
}
