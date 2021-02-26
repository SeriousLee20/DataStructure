
/*
 * Author: Hui Xin
 * 04 Feb 2021
 */

/* Doubly linked list*/
public class LinkedList {
    class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // add node at the end of list
    public void append(int data) {

        // 1. create a node and put in new data
        Node newNode = new Node(data);
        newNode.next = null;    // 2. next node of the new node will be null

        // 3. if the list is new, new node will be the head
        if (head == null) {
            head = newNode;
            head.prev = null;
            return;
        }

        // 4. else traverse till the last node
        Node current = head;
        while (current.next != null) {
            current = current.next; //go until the last element of the list (next position is null)
        }

        // 5. new node is appended to the last node
        current.next = newNode;

        // 6. the prev node of the new node is the ori last node
        current.next.prev= current;
    }

    // add node the front of the list
    public void prepend(int data) {
        // 1. create new node and put in new data
        Node newHead = new Node(data);

        // 2. next node of new node is the ori head
        newHead.next = head;

        // 3. assign new head as the head
        head = newHead;

        // 4. prev node of head is null
        head.prev = null;
    }

    // insert node after a given node
    public void insertAfter(Node prevNode, int data) {

        // 1. create new node and put in new data
        Node newNode = new Node(data);

        // 2. new node only can only insert after a not null node
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        // prev node's next node is now new node's next node
        newNode.next = prevNode.next;

        // 4. prev node's next is now new node
        prevNode.next = newNode;

        // 5. new node's prev node is the prev node
        newNode.prev = prevNode;

        // 6. the prev node of the next node of new node is new node
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    // insert node before a given node
    public void insertBefore(Node nextNode, int data) {

        // 1. create new node and put in new data
        Node newNode = new Node(data);

        // new node only insert before a not null node
        if (nextNode == null) {
            System.out.println("Next node cannot be empty");
            return;
        }

        // prev node of next node becomes prev node of new node
        newNode.prev = nextNode.prev;

        // 4. new node's next node is the next node
        newNode.next = nextNode;

        // 5. next node's prev node is the new node
        nextNode.prev = newNode;

        // 6. if the prev node of the new node is not null
        // its next node will be the new node
        // else the new node will be the head
        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        } else {
            head = newNode;
        }

    }

    public void deleteWithValue(int data) {
        if(head == null) return;

        // if the data wanted to delete is the head node
        if (head.data == data) {
            head = head.next;
            return;
        }

        // if the next data is the one want to delete
        // then juz set assign the next next data to it
        // so the data chosen is deleted from the list
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next; // the current pointer is at the next element
        }
    }

    public void deleteNode(Node delNode) {

        // base case
        if (head == null || delNode == null) {
            return;
        }

        // to delete head node
        if (head == delNode) {
            head = head.next;
        }

        // connect next node of delNode to the prev node of delNode
        if (delNode.next != null) {
            delNode.next.prev = delNode.prev;
        }

        // connect prev node of delNode to the next node of delNode
        if (delNode.prev != null) {
            delNode.prev.next = delNode.next;
        }
    }

    public void printList() {

        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node current = head;

        System.out.println("Elements of the list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
