package com.ctci.LL2;

public class CH2Q2 {
     // one way to do is just iterate through the linkedList to get the length of LL
    // once we know length, we know we should remove length -kth element so iterate until length-k+1 and remove element


    // other way to do is by having a fast and slow pointers and let fast start at kth index and then we
    // can move both slow an fast pointer by 1 node each until fast reaches end. When fast reaches end, slow will be on lkth to last node
    public LLNode removeKthToLastNode(LLNode head,int k) {

        LLNode fast = head;
        LLNode slow = head;

        for (int i =0; i< k;i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        } // once we break out of loop, slow will be pointing to last but kth node and fast will be null

        return slow;

    }


}
