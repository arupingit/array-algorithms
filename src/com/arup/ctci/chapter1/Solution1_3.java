package com.arup.ctci.chapter1;

/**
 * Cracking the Code interview Chapter1 Solution 1.3
 * URLify
 * 
 * @author arupdutta
 *
 */
public class Solution1_3 {

	public static void main(String[] args) {
		System.out.println(urlify("Mr John Smith    "));
	}
	
	public static String urlify(String inputStr){
		char[] inputArr = inputStr.toCharArray();
		boolean lastCharFound = false;
		for(int i=inputArr.length-1,j=inputArr.length-1;i>=0;i--){
			if(inputArr[i]==32){
				if(!lastCharFound){
					continue;
				} else {
					inputArr[j--]='0';
					inputArr[j--]='2';
					inputArr[j--]='%';
				}
			} else {
				if(!lastCharFound){
					lastCharFound = true;
				}
				inputArr[j] = inputArr[i];
				j--;
			}
		}
		return String.valueOf(inputArr);
	}

}
