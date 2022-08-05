package com.ctci;

import com.ctci.Strings1.Q7;
import com.ctci.Strings1.Q9;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        Q7 q7 = new Q7();
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        q7.rotateMatrix(matrix);

        Q9 q9 = new Q9();
        System.out.println(q9.isStringRotated("waterbottle", "erbottlewat"));
    }
}
