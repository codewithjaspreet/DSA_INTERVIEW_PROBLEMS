
class MergeNodes {
    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode mergeNodes(ListNode head) {

            ListNode cur = head.next;
            int sum = 0;
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;

            while (cur != null) {

                while (cur.val != 0) {

                    sum += cur.val;
                    cur = cur.next;
                }

                temp.next = new ListNode(sum);
                temp = temp.next;
                cur = cur.next;

                sum = 0;
            }

            return dummy.next;

        }
    }
}