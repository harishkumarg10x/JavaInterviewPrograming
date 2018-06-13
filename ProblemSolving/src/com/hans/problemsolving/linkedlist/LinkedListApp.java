package com.hans.problemsolving.linkedlist;

/**
 * Created by GBS03795 on 11-12-2017.
 */
public class LinkedListApp {

    public static void main(String[] args) {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.insertInEnd("Harish");
        linkedList.insertInEnd("Ram");
        linkedList.insertInEnd("1");
        linkedList.reverse();
        linkedList.print();
    }
}
