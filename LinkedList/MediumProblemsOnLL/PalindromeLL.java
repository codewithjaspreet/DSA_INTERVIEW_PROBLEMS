
import java.util.*;
class Solution {

    
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
     
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        slow.next = reverseLL(slow.next);
        slow = slow.next;

        while (slow != null) {

            if (head.val != slow.val)
                return false;
            slow = slow.next;
            head = head.next;
        }

        return true;
    }

    static ListNode reverseLL(ListNode head) {
        // code here
        ListNode temp;
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {

            temp = cur.next;

            cur.next = prev;

            prev = cur;

            cur = temp;
        }

        return prev;
    }
    
    

    public boolean isPalindrome2(ListNode head) {

        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;
        while (temp != null) {

            st.push(temp);
            temp = temp.next;
        }

        temp = head;

        while (st.size() > 0 && temp != null) {

            if (st.pop().val != temp.val)
                return false;

            temp = temp.next;

        }

        return true;
    }

}
