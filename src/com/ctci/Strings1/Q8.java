package com.ctci.Strings1;

public class Q8 {
    public int[][] zeroMatrix(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for (int i =0; i < matrix.length; i++) {
            for (int j =0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i =0; i < rows.length; i++) {
            if (rows[i] == true) {
                for (int k = 0; k < matrix[0].length; k++) {
                    matrix[i][k] = 0;
                }
            }
        }

        for (int j =0; j < cols.length; j++) {
            if (cols[j] == true) {
                for (int k = 0; k < matrix.length; k++) {
                    matrix[k][j] = 0;
                }
            }
        }
        return matrix;
    }
}
