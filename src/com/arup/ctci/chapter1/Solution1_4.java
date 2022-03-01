package com.arup.ctci.chapter1;

public class Solution1_4 {

	public static void main(String[] args) {
		System.out.println(isPalindromePermutation("Tact Coa"));
	}
	
	public static boolean isPalindromePermutation(String inputStr){
		char[] inputArr =  inputStr.toLowerCase().toCharArray();
		int charCounter = 0;
		int[] charArr = new int[26];
		int index;
		for(int i=0;i<inputArr.length;i++){
			if('a'<=inputArr[i] && inputArr[i]<='z'){
				charCounter++;
				index = Integer.valueOf(inputArr[i])-Integer.valueOf('a');
				charArr[index]++;
			}
		}
		if(charCounter%2==0){
			//Even count of characters
			for(int i=0;i<26;i++){
				if(charArr[i]%2==1){
					return false;
				}
			}
			return true;
		} else {
			//Odd count of characters
			boolean oneOddFound = false;
			for(int i=0;i<26;i++){
				if(charArr[i]%2==1){
					if(!oneOddFound){
						oneOddFound = true;
						continue;
					} else{
						return false;
					}
				}
			}
			return oneOddFound;
		}
	}

}
