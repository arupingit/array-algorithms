package com.arup.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
54. Spiral Matrix

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 
Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100

 * 
 * @author arupdutta
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] i = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] j = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] k = {{1,2},{3,4}};
		System.out.println(Arrays.toString(spiralOrder(i).toArray()));
		System.out.println(Arrays.toString(spiralOrder(j).toArray()));
		System.out.println(Arrays.toString(spiralOrder(k).toArray()));
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		int left = 0;
		int right = matrix[0].length;
		int top = 0;
		int bottom = matrix.length;
		
		while(left<right && top<bottom){
			//move from left to right
			for(int i = left;i<right;i++){
				result.add(matrix[top][i]);
			}
			//increment top
			top++;
			
			//move from top to bottom
			for(int i=top;i<bottom;i++){
				result.add(matrix[i][right-1]);
			}
			//decrement right
			right--;
			
			if(!(left<right && top<bottom)){
				break;
			}
			
			//move from right to left
			for(int i=right-1;left-1<i;i--){
				result.add(matrix[bottom-1][i]);
			}
			//decrement bottom
			bottom--;
			
			//move from bottom to top
			for(int i=bottom-1;top-1<i;i--){
				result.add(matrix[i][left]);
			}
			//increment left 
			left++;
		}
		return result;
    }

}
