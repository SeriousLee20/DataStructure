/*
 * Author: Hui Xin
 * 26 Feb 2021
 */

public class Tester {
    public static void main(String[] args) {

        LinkedList dll = new LinkedList();

        dll.append(3);
        dll.printList();
        dll.insertAfter(dll.head, 5);
        dll.printList();
        dll.insertBefore(dll.head.next, 7);
        dll.printList();
        dll.prepend(9);
        dll.printList();
        dll.deleteNode(dll.head.next.next);
        dll.printList();
    }
}
