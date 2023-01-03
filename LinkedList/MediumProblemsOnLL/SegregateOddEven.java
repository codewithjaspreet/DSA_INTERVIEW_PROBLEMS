

class Solution {

    static class Node{

        Node next;
        int data;

        Node(int data){
            this.data =data;
        }
    }
    Node divide(int N, Node head) {
        // code here
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node odd = dummy1;
        Node even = dummy2;
        Node cur = head;

        while (cur != null) {

            if (cur.data % 2 != 0) {

                odd.next = cur;
                odd = odd.next;
            }

            else {

                even.next = cur;
                even = even.next;

            }

            cur = cur.next;

        }

        even.next = dummy1.next;
        odd.next = null;

        return dummy2.next;

    }
}