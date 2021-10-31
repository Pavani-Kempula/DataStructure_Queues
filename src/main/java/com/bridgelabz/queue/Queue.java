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
    public void enQueue(T DATA)
    {
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

    //this method will return length of an queue.
    public int size() {
        return length;
    }

    /*
     * Name : deQueue
     *
     * Description : Deleting data from the queue.
     *
     * @return
     */
    public T deQueue() {
        if(front != null) {
            T result = front.DATA;
            front = front.next;
            length--;
            return result;
        }
        return null;
    }

    /*
     * Name : displayQueue
     *
     * Description : Traversing over queue and printing the element inside queque.
     */
    public void displayQueue() {
        Node<T> curretnNode = front;
        while(curretnNode != null) {
            System.out.print(curretnNode.DATA+ " ");
            curretnNode = curretnNode.next;
        }
    }
}
