// Problem 7: Delete Node in a Linked List 

//Question

// There is a singly-linked list head and we want to delete a node node in it.
// You are given the node to be deleted node. You will not be given access to the first node of head.
// All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.


//Solution

import java.lang.classfile.components.ClassPrinter.ListNode;

class problem7 {
     public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}