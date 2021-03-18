package com.arup;
/**
 * This is an algorithm to rotate the array 
 * Inputs:
 * arr[] is the input array
 * d is number of places the array is rotated
 * n is the size of the array
 * 
 * @author dutta.arup59@gmail.com
 *
 */
public class ArrarRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d = 3;
		int n = arr.length;
		int temp[] = new int[d];
		
		printArray(arr);
		
		for(int i=0; i<n; i++){
			if(i<d){
				temp[i] = arr[i];
			} else {
				arr[i-d] = arr[i];
			}
		}
		
		for(int j=0; j<d; j++){
			arr[n-d+j] = temp[j];
		}
		
		printArray(arr);
	}
	
	private static void printArray(int arr[]){
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
