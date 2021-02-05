
/*
 * Author: Hui Xin
 * 04 Feb 2021
 */

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }
}


/* Doubly linked list*/
public class LinkedList {

    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next; //go until the end of the list (next element is null)
        }

        current.next = new Node(data);  // create a new node at the end of list
    }

    // append at the front
    // swapping
    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
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
}
