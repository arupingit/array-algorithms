package com.arup.ctci.chapter1;

/**
 * Cracking the Code interview Chapter1 Solution 1.9
 * String Rotation
 * 
 * @author arupdutta
 *
 */
public class Solution1_9 {

	public static void main(String[] args) {
		System.out.println(isStringRotation("waterbottle","erbottlewat"));
	}
	
	public static boolean isStringRotation(String s1, String s2){
		StringBuilder sb = new StringBuilder(s1);
		sb.append(s1);
		if(s1.length()==s2.length() && s1.length()>0){
			return sb.toString().contains(s2);
		}
		return false;
	}

}
