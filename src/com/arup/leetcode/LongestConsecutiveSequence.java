package com.arup.leetcode;

import java.util.HashSet;

/**
 * 
128. Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
 * 
 * @author arupdutta
 *
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] i = {100,4,200,1,3,2};
		int[] j = {0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsecutive(i));
		System.out.println(longestConsecutive(j));
	}
	
	//Hint : Use Numberline and HashSet DS
	public static int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		int length = 0;
		int finalResult = 0;
		for(int i=0;i<nums.length;i++){
			set.add(nums[i]);
		}
		//check if the left neighbour if the element is present in set
		for(int i=0;i<nums.length;i++){
			length = 1;
			if(!set.contains(nums[i]-1)){
				while(set.contains(++nums[i])){
					length++;
				}
			}
			if(finalResult<length){
				finalResult = length;
			}
		}
        return finalResult;
    }
}
