
/*
 * Author: Hui Xin
 * 05 Feb 2021
 */

public class Queue {

    //Stacks & queues
    /*
     * both linear data structures
     * flexible size
     * DIFFERENCES: how the element is removes
     * Stack: Last In First Out
     * Queue: First In First Out */

    // to keep a pointer or variable (data)
    // each node needs a pointer to the next
    private static class Node {

        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;  // remove from the head
    private Node tail;  // add things to the tail

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.data;
    }

    public void add(int data) {

        // create the node
        Node node = new Node(data);

        // if tail is not null, tails next pointer point over this node
        if (tail != null) {
            tail.next = node;
        }

        // update the tail
        tail = node;

        // if the head is null, the node will also becomes the head
        if (head == null) {
            head = node;
        }
    }

    // remove from the head of the linked list
    public int remove() {
        int data = head.data;
        head = head.next;

        // if head is null then tail also set null
        if (head == null) {
            tail = null;
        }

        return data;
    }
}

