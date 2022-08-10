package com.ctci.LL2;

import java.util.HashSet;
import java.util.Set;

public class CH2Q1 {

    public LLNode removeDuplicates(LLNode head) {
        Set<Integer> values = new HashSet<Integer>();
        LLNode node = head;
        LLNode prev = head;

        while(node != null) {
            if (values.contains(node.val)) { // found duplicate
                prev.next = node.next; // remove the current node link
            } else {
                values.add(node.val);
                prev = node; // update prev only when duplicate is not found
            }
            node = node.next; // update node value
        }

        return head;
    }

    public LLNode removeDuplicatesNoBuffer(LLNode head) {
        LLNode nodeOuter = head;

        while(nodeOuter != null) {
            LLNode nodeInner = nodeOuter;
            while(nodeInner.next != null) {
                if (nodeOuter.val == nodeInner.next.val) { // found duplicate
                    nodeInner.next = nodeInner.next.next;
                } else {
                    nodeInner = nodeInner.next;
                }
            }
            nodeOuter = nodeOuter.next;
        }
        return head;
    }
}
