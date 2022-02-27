package com.arup.leetcode;

import java.util.Arrays;

/**
 * 
48. Rotate Image

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000

 * 
 * @author arupdutta
 *
 */
public class RotateImage {

	public static void main(String[] args) {
		int[][] i = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] j = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int[][] k = {{4,8},{3,6}};
		rotate(i);
		rotate(j);
		rotate(k);
	}
	
	public static void rotate(int[][] matrix) {
		System.out.println("Input : " + Arrays.deepToString(matrix));
		int top = 0;
		int bottom = matrix.length;
		int left = 0;
		int right = matrix.length;
		int var1;
		int var2;

		while(left<right){
			for(int i=0;i<right-1-left;i++){
				//Move node from top to right
				var1 = matrix[top+i][right-1];
				matrix[top+i][right-1] = matrix[top][left+i];
				//Move node from right to bottom
				var2 = matrix[bottom-1][right-1-i];
				matrix[bottom-1][right-1-i] = var1;
				//Move node from bottom to left
				var1 = matrix[bottom-1-i][left];
				matrix[bottom-1-i][left] = var2;
				//Move node from left to top
				var2 = matrix[top][left+i];
				matrix[top][left+i] = var1;				
			}
			left++;
			right--;
			top++;
			bottom--;
		}
		
		System.out.println("Output : " + Arrays.deepToString(matrix));
    }

}
