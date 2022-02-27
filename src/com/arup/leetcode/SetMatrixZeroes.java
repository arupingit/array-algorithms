package com.arup.leetcode;

import java.util.Arrays;

/**
 * 
73. Set Matrix Zeroes

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 
Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 
Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

 * 
 * @author arupdutta
 *
 */
public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] i = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int[][] j = {{1,1,1},{1,0,1},{1,1,1}};
		setZeroes(i);
		setZeroes(j);
	}

	public static void setZeroes(int[][] matrix) {
		System.out.println("Input : "+Arrays.deepToString(matrix));
        int rows = matrix.length;
        int columns = matrix[0].length;
        int firstRow = 1;
        
        for(int r=0;r<rows;r++){
        	for(int c=0;c<columns;c++){
        		if(matrix[r][c]==0){
        			matrix[0][c] = 0;
        			if(r>0){
        				matrix[r][0] = 0;
        			} else {
        				firstRow = 0;
        			}
        		}
        	}
        }
        
        for(int r=1;r<rows;r++){
        	for(int c=1;c<columns;c++){
        		if(matrix[0][c]==0 || matrix[r][0]==0){
        			matrix[r][c] = 0;
        		}
        	}
        }
        
        if(matrix[0][0]==0){
        	for(int r=0;r<rows;r++){
        		matrix[r][0] = 0;
        	}
        }
        if(firstRow==0){
        	for(int c=0;c<columns;c++){
        		matrix[0][c] = 0;
        	}
        }
        System.out.println("Output : "+Arrays.deepToString(matrix));
    }
}
