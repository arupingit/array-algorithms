package com.arup.gfg;

public class PivotedBinarySearch {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,1,2,3};
		int n = arr.length;
		int key = 2;
		int pivot = findPivot(arr, 0, n);
		int arrayPositionOfValue;
		if(arr[0]>key){
			arrayPositionOfValue = binarySearch(arr, pivot+1, n, key);
		}else{
			arrayPositionOfValue = binarySearch(arr, 0, pivot, key);
		}
		System.out.println(arrayPositionOfValue);
	}
	
	private static int findPivot(int[] arr, int low, int high){
		if(high<low){
			return -1;
		}
		if(high==low){
			return low;
		}
		int mid = (low+high)/2;
		if(mid<high && arr[mid]>arr[mid+1]){
			return mid;
		}
		if(mid>low && arr[mid]<arr[mid-1]){
			return mid-1;
		}
		if(arr[low]>=arr[mid]){
			return findPivot(arr, low, mid);
		}
		return findPivot(arr, mid+1, high);
	}
	
	private static int binarySearch(int[] arr, int low, int high, int key){
		if(high<low){
			return -1;
		}
		int mid = (high+low)/2;
		if(arr[mid] == key){
			return  mid;
		}
		if(arr[mid]>key){
			return binarySearch(arr, low, mid-1, key);
		} else {
			return binarySearch(arr, mid+1, high, key);
		}
	}

}
