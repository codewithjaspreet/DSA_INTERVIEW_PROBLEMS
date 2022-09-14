package SinglyLinkedListImplementation;

import java.util.Scanner;

public class LL {
    Node head;
    Node tail;
    int size;

    LL() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtfirst(int i) {
        Node node = new Node(i);

        node.next = head;
        head = node;
        size++;
    }

    public void insertAtLast(int i) {

        if (tail == null) {
            insertAtfirst(i);
        }

        else {
            Node node = new Node(i);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void addAddPosition(int i, int val) {
        if (i == 0) {

            insertAtfirst(val);
            return;
        }

        if (i >= size) {

            insertAtLast(val);
            return;
        }
        Node temp = head;

        for (int j = 1; j < i; j++) {

            temp = temp.next;

        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    public void Display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public class Node {

        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }

    }
}
