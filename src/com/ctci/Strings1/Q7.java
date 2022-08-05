package com.ctci.Strings1;

public class Q7 {

    public int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];

        for (int i =0; i < n; i++) {
            for (int j =0; j < n; j++) {
                rotatedMatrix[j][(n-1)-i] = matrix[i][j];
            }
        }

        for (int i =0; i < n; i++) {
            System.out.print("\n");
            for (int j =0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }

        System.out.print("\n");

        for (int i =0; i < n; i++) {
            System.out.print("\n");
            for (int j =0; j < n; j++) {
                System.out.print(rotatedMatrix[i][j]+" ");
            }
        }
        return rotatedMatrix;
    }

//    public int[][] rotateMatrixInPlace(int[][] matrix) {
//
//    }
}
