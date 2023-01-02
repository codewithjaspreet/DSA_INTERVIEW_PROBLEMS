class Solution {

    static class ListNode{

        ListNode next;
        int data;



        ListNode(ListNode next){
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;

    }
}