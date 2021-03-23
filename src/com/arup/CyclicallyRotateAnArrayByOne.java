package com.arup;

public class CyclicallyRotateAnArrayByOne {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		int temp;
		printArray(arr);
		temp = arr[n-1];
		for(int i=n-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0] = temp;
		printArray(arr);
	}
	
	private static void printArray(int arr[]){
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
