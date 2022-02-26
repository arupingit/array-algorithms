package com.arup.leetcode;

/**
 * 
287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.

 * 
 * 
 * @author arupdutta
 *
 */
public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int[] i = {1,3,4,2,2};
		int[] j = {3,1,3,4,2};
		System.out.println(findDuplicate(i));
		System.out.println(findDuplicate(j));
	}
	
	//Floyd's Cycle Detection Algorithm
	public static int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        do{
        	slow = nums[slow];
        	fast = nums[nums[fast]];
        }while(fast!=slow);
		System.out.println("intersection point : "+ slow);
		fast = 0;
		while(fast!=slow){
			slow = nums[slow];
    		fast = nums[fast];
		}
		return slow;
    }
}
