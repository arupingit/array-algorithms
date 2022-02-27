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
public class RotateImage1 {

	public static void main(String[] args) {
		int[][] i = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] j = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int[][] k = {{4,8},{3,6}};
		rotate(i);
		rotate(j);
		rotate(k);
	}
	
	//Using transpose and two pointer
	public static void rotate(int[][] matrix) {
		System.out.println("Input : " + Arrays.deepToString(matrix));
		int columns = matrix.length;
		int temp;
		for(int i=0;i<columns;i++){
			for(int j=i;j<columns;j++){
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i=0;i<columns;i++){
			for(int j=0,k=columns-1;k>j;j++,k--){
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][k];
				matrix[i][k] = temp;
			}
		}
			
		System.out.println("Output : " + Arrays.deepToString(matrix));
    }

}
