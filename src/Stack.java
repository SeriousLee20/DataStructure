
/*
 * Author: Hui Xin
 * 05 Feb 2021
 */

public class Stack {
    private static class Node {

        private int data;
        private Node next; //pointer to the next node

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {

        // new node
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    // return old top's data
    public int pop() {
        int data = top.data;
        top = top.next; // the top is moved to the next element down
        return data;
    }
}
