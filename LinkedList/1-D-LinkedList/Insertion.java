

class Solution {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
    // Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x) {
        Node node = new Node(x);

        if (head == null)
            return node;

        else {

            node.next = head;
            head = node;
        }

        return node;

    }

    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node node = new Node(x);

        if (head == null)
            return node;

        Node last = head;

        while (last.next != null) {

            last = last.next;
        }

        last.next = node;

        return head;

    }

    
}