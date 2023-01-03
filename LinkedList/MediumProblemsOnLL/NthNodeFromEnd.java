class NthNodeFromEnd {

    static class Node{

        Node next;
        int data;

        Node(Node next  , int data){

            this.next = next;
            this.data = data;
        }

    }
    // Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
        // Your code here

        int len = getlen(head);
        int ind = 0;

        if (n > len)
            return -1;

        while (head != null && ind < (len - n)) {

            head = head.next;
            ind++;
        }

        return head.data;

    }

    static int getlen(Node head) {

        int c = 0;
        while (head != null) {

            c++;
            head = head.next;
        }

        return c;
    }
}
