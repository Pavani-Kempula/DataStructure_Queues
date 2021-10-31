package com.bridgelabz.queue;

public class Node<T> {
    final T DATA;
    Node<T> next;

    public Node(T DATA) {
        super();
        this.DATA = DATA;
        this.next = null;
    }
}
