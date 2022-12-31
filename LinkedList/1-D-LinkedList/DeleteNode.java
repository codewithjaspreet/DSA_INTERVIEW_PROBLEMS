
// deleting a node is easy but what if u are not provided with the head 

// steps for that

//  store the next node to the given node which to be deleted

// copy the data of that node to the node to be deleted

// point the next of the node to be deleted to next of the temp node .
class Solution {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int x) {
            data = x;
            next = null;
        }
    }

    public void deleteNode(ListNode node) {

        ListNode cur = node.next;

        node.data = cur.data;

        node.next = cur.next;
    }
}