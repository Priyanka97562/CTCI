package com.ctci.LL2;

public class LLNode {
    public int val;
    public LLNode next;

    public LLNode(int val) {
        this.val = val;
    }

    public void appendToTail(int value) {
        LLNode newNode = new LLNode(value);

        LLNode node = this; // assign current Node

        while(node.next != null) {
            node = node.next; // update node val to next
        }
        node.next = newNode;
    }

    public LLNode deleteNode(int value) {
        LLNode node = this;

        if (node.val == value) {
            LLNode head = node.next;
            node.next = null;
            return head;
        }

        while(node.next != null) {
            LLNode prev = node;
            LLNode curr = node.next;
            if (curr.val == value) {
                prev.next = curr.next;
                return this;
            }
            node = node.next;
        }
        return this;
    }

    public void printLL() {
        LLNode head = this;
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
