package com.arup;

public class FindMaxSumArrayWithRotation {

	public static void main(String[] args){
		int[] arr = {3,4,5,1,2};
		int n = arr.length;
		int sum = findSum(arr);
		int max = sum;
		int arraysum = arraysum(arr);
		
		for(int i=1; i<n; i++){
			sum = arraysum + sum - n*2;
			System.out.println(sum);
			if(sum>max){
				max = sum;
			}
		}
		
		System.out.println("Max value = "+ max);
	}
	
	private static int findSum(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum = sum + i*arr[i];
		}
		return sum;
	}
	
	private static int arraysum(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		return sum;
	}
}
