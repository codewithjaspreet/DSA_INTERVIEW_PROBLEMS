
class GfG {

    static class Node {
        Node next;
        int data;
        Node prev;

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        public Node(int data) {
            this.data = data;
        }

        

        
    }
    // Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data) {
        // Your code here
        Node temp = head_ref;

        while (pos != 0) {

            temp = temp.next;
            pos--;
        }

        Node node = new Node(data);

        if (temp.next == null) {

            node.next = null;
            temp.next = node;
            node.prev = temp;

        } else {
            // storing next node to current node in link part(next) of new node.
            node.next = temp.next;

            // storing new node in link part(next) of current node.
            temp.next = node;

            // storing the new node in previous link part(prev) of the node which
            // was next to current node initially.
            temp.next.prev = node;

            // store the current node in previous link part(prev) of new node.
            node.prev = temp;

        }

    }
}