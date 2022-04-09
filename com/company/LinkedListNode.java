package com.company;

import com.google.gson.Gson;

public class LinkedListNode {
    int val;
    LinkedListNode next;

    public LinkedListNode(int val) {
        this.val = val;
    }

    public LinkedListNode(int val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }

    static LinkedListNode createLinkedList(int arr[]) {
        LinkedListNode root = null;
        for (int i = 0; i < arr.length; i++)
            root = insert(root, arr[i]);
        return root;
    }


    public static LinkedListNode insert(LinkedListNode root, int item) {


        LinkedListNode temp = new LinkedListNode(item);
        LinkedListNode ptr;
        if (root == null)
            root = temp;
        else {
            ptr = root;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
        return root;

    }
}