package com.ctci;

import com.ctci.LL2.CH2Q1;
import com.ctci.LL2.CH2Q4;
import com.ctci.LL2.LLNode;
import com.ctci.Strings1.Q1;
import com.ctci.Strings1.Q7;
import com.ctci.Strings1.Q9;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        Q1 q1 = new Q1();
        System.out.println("Is Unique? - "+q1.isUnique("sarth"));

        System.out.println("Is Unique in place? - "+q1.isUniqueInPlace("Priyanka"));

        Q7 q7 = new Q7();
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        q7.rotateMatrix(matrix);

        Q9 q9 = new Q9();
        System.out.println(q9.isStringRotated("waterbottle", "erbottlewat"));

        LLNode node1 = new LLNode(1);
        LLNode node2 = new LLNode(3);
        LLNode node3 = new LLNode(4);
        LLNode node4 = new LLNode(5);
        LLNode node5 = new LLNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        node1.printLL();
        node1.appendToTail(5);
        node1.printLL();
        //node1.deleteNode(1);
        //node1.printLL();

        CH2Q1 ch2Q1 = new CH2Q1();

        ch2Q1.removeDuplicatesNoBuffer(node1);
        System.out.println("Linked List after removing duplicates");
        node1.printLL();

        CH2Q4 ch2Q4 = new CH2Q4();
        LLNode head = ch2Q4.partition(node1, 4);
        System.out.println("Linked list after partition:");
        head.printLL();


    }
}
