package com.arup.ctci.chapter1;

public class Solution1_5 {

	public static void main(String[] args) {
		System.out.println(isOneAway("pale","ple"));
		System.out.println(isOneAway("pales","pale"));
		System.out.println(isOneAway("pale","bale"));
		System.out.println(isOneAway("pale","bake"));
	}

	public static boolean isOneAway(String inputStr1, String inputStr2){
		
		if(Math.abs(inputStr1.length()-inputStr2.length())>1){
			return false;
		} else {
			String shortStr = null;
			String longStr = null;
			boolean foundFirstMisMatch = false;
			if(inputStr1.length()>inputStr2.length()){
				shortStr = inputStr2;
				longStr = inputStr1; 
			} else {
				shortStr = inputStr1;
				longStr = inputStr2;
			}
			int shortIndex = 0;
			int longIndex = 0;
			while(shortIndex<shortStr.length() && longIndex<longStr.length()){
				if(shortStr.charAt(shortIndex) != longStr.charAt(longIndex)){
					if(foundFirstMisMatch){
						return false;
					}
					foundFirstMisMatch = true;
					if(shortStr.length()==longStr.length()){
						shortIndex++;
					}
				} else {					
					shortIndex++;					
				}
				longIndex++;
			}
			return true;
		}
	}
}
