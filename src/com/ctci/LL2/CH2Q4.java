package com.ctci.LL2;

public class CH2Q4 {

    public LLNode partition(LLNode head, int x) {
        LLNode node = head;

        LLNode leftListStart = null, leftListEnd = null, rightListStart = null , rightListEnd = null;

        while(node!= null) {
            LLNode next = node.next;
            node.next = null;
            if (node.val < x) { // build left list
                if (leftListStart == null) { // first node in left list
                    leftListStart = node;
                    leftListEnd = node;
                } else {
                    leftListEnd.next = node;
                    leftListEnd = node;
                }

            } else { // build right list
                if (rightListStart == null) { // first node in right list
                    rightListStart = node;
                    rightListEnd = node;
                } else {
                    rightListEnd.next = node;
                    rightListEnd = node;
                }
            }

            node = next;
        }

        // Once the lists are formed, merge them
        if (leftListStart == null) {
            return rightListStart;
        }

        leftListEnd.next = rightListStart;
        return leftListStart;

    }
}
