package com.bridgelabz.queue;

/*
 * @author Pavani
 *
 * Implementing Data structure concept of Queue
 * using linkedList.
 */

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    private int length;

    /*
     * Name : enQueue
     *
     * Description : Inserting elements into queue.
     *
     * @param DATA
     */
    public void enQueue(T DATA) {
        if(front == null) {
            rear = new Node<T>(DATA);
            front = rear ;
        }
        else {
            rear.next = new Node<T>(DATA);
            rear = rear.next;
        }
        length++;
    }

    //this method will return length of a queue.
    public int size() {
        return length;
    }

    /*
     * Name : displayQueue
     *
     * Description : Traversing over queue and printing the element inside queue.
     */
    public void displayQueue() {
        Node<T> curretnNode = front;
        while(curretnNode != null) {
            System.out.print(curretnNode.DATA+ " ");
            curretnNode = curretnNode.next;
        }
    }

}
