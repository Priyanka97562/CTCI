package com.ctci.LL2;

public class CH2Q3 {

    public LLNode deleteNode(LLNode randomNode) { // delete any node that is not the first or last node in a LL given a random node in the list
        // way to do is check if next node is not the last node, if its not just delete that

        if (randomNode == null || randomNode.next == null) { // node == null when given node is last element and node.next == null when next node of given element is last node
            return randomNode; // did not delete anything
        }

        LLNode node = randomNode.next; // delete this

        randomNode.val = node.val;
        randomNode.next = node.next;


        return randomNode;

    }
}
