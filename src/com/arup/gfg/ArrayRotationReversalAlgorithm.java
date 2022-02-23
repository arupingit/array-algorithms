package com.arup.gfg;
/**
 * This is an algorithm to rotate the array using reversal algorithm
 * Inputs:
 * arr[] is the input array
 * d is number of places the array is rotated
 * n is the size of the array
 * 
 * https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
 * 
 * @author dutta.arup59@gmail.com
 *
 */
public class ArrayRotationReversalAlgorithm {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d = 2;
		int n = arr.length;
		int temp1[] = new int[d];
		int temp2[] = new int[n-d];
		
		printArray(arr);
		
		for(int i=0;i<n;i++){
			if(i<d){
				temp1[i] = arr[i];
			}else{
				temp2[i-d] = arr[i];
			}
		}
		
		 temp1 = leftRotate(temp1);
		 temp2 = leftRotate(temp2);
		 
		 for(int j=0; j<n; j++){
			 if(j<d){
				 arr[j] = temp1[j];
			 }else{
				 arr[j] = temp2[j-d];
			 }
		 }
		 
		 arr = leftRotate(arr);
		 printArray(arr);
	}
	

	private static int[] leftRotate(int[] arr){
		int temp;
		int n = arr.length;
		for(int i=0; i< (n/2); i++){
			temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		return arr;
	}
	
	private static void printArray(int arr[]){
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
