package com.hans.problemsolving.linkedlist;

/**
 * Created by GBS03795 on 11-12-2017.
 */
public class SinglyLinkedList<T> {
    Node<T> start;
    Node<T> end;
    int size;

    public SinglyLinkedList() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public void print() {
        if(size == 0) {
            System.out.println("No items in list");
            return;
        }
        if(start != null && start.next == null) {
            System.out.println(start.getData());
            return;
        }
        Node next = start.next;
        while (next != null) {
            next = start.next;
            start.next = null;
            System.out.println(start.getData());
            start = next;
        }
    }

    public void insertInStart(T value) {
        size++;
        Node<T> node = new Node<>(value, null);
        if(start == null) {
            start = node;
            end = start;
        } else {
            node.next = start;
            start = node;
        }
    }

    public void insertInEnd(T value) {
        size++ ;
        Node<T> node = new Node<>(value, null);
        if(start == null)
        {
            start = node;
            end = start;
        }
        else
        {
            end.next = node;
            end = node;
        }
    }

    public void reverse() {
        Node reversed = null;
        Node current = start;
        while(current != null) {
            Node next = current.next;
            current.next = reversed;
            reversed = current;
            current = next;
        }
        start = reversed;
    }
}
