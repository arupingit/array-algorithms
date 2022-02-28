package com.arup.ctci.chapter1;

/**
 * Cracking the Code interview Chapter1 Solution 1.1
 * Is Unique
 * 
 * @author arupdutta
 *
 */
public class Solution1_1 {

	public static void main(String[] args) {
		String i = "test";
		String j = "NO_duplicate";
		System.out.println(isUnique(i));
		System.out.println(isUnique(j));
	}
	
	//Hint : use ASCII characters
	public static boolean isUnique(String input){
		if(input.length()>128){
			return false;
		}
		boolean[] asciiArray = new boolean[128];
		int asciiIndex;
		for(int i=0;i<input.length();i++){
			asciiIndex = input.charAt(i);
			if(asciiArray[asciiIndex]){
				return false;
			} else {
				asciiArray[asciiIndex] = true;
			}
		}
		return true;
	}

}
