package com.arup;

public class FindSumFromSortedAndRotatedArray {

	public static void main(String[] args) {
		int sum = 7;
		int[] arr = {3,4,5,1,2};
		int n = arr.length;
		int pivot = findPivot(arr,0,n-1);
		//indexes are incremented and decremented in rotational manner using modular arithmetic.
		int pointer1 = (pivot+1)%n;
		int pointer2 = pivot;
		while(pointer2!=pointer1){
			if(arr[pointer1]+arr[pointer2]==sum){
				System.out.println("{"+arr[pointer1]+","+arr[pointer2]+"}");
			}
			// If current pair sum is less,  
            // move to the higher sum
			if(arr[pointer1]+arr[pointer2]<sum){
				pointer1 = (pointer1+1)%n;
			} else {
			// Move to the lower sum side
				pointer2 = (n+pointer2-1)%n;
			}
		}
	}
	
	private static int findPivot(int[] arr, int low, int high){
		if(low>high){
			return -1;
		}
		if(low==high){
			return low;
		}
		int mid = (low+high)/2;
		if(low<mid && arr[mid]>arr[mid+1]){
			return mid;
		}
		if(mid<high && arr[mid]<arr[mid-1]){
			return mid-1;
		}
		if(arr[mid]<=arr[low]){
			return findPivot(arr, low, mid-1);
		}
		return findPivot(arr, mid+1, high);
	}

}
