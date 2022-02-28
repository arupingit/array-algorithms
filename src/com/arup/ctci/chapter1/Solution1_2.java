package com.arup.ctci.chapter1;

/**
 * Cracking the Code interview Chapter1 Solution 1.2
 * Check Permutation
 * 
 * @author arupdutta
 *
 */
public class Solution1_2 {

	public static void main(String[] args) {
		String i = "test";
		String j = "estt";
		System.out.println(checkPermution(i,j));
	}
	
	public static boolean checkPermution(String input1, String input2){
		int[] input1Array = new int[128];
		int[] input2Array = new int[128];
		for(int i=0;i<input1.length();i++){
			++input1Array[input1.charAt(i)];
		}
		for(int i=0;i<input2.length();i++){
			++input2Array[input2.charAt(i)];
		}
		for(int i=0;i<128;i++){
			if(input1Array[i]!=input2Array[i]){
				return false;
			}
		}
		return true;
	}

}
