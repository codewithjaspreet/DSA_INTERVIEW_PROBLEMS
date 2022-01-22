// ODD EVEN SEGREGATION
// O(N) time & O(1) space : In - place
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)  return head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode o = odd;
        ListNode e = even;
        ListNode cur = head;
         boolean isOdd = true;
        
        while(cur != null){
            if(cur.val%2 !=0){
                o.next = cur;
                o = o.next;
            }
            else{
                e.next = cur;
                e = e.next;
            }
             isOdd = !isOdd;
            cur = cur.next;
        }
        o.next = even.next;
        e.next = null;
        
        return odd.next;
    }
}



// LEETCODE ODD EVEN : 

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)  return head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode o = odd;
        ListNode e = even;
        ListNode cur = head;
        Boolean f = true;
        
        while(cur != null){
            if(f){
                o.next = cur;
                o = o.next;
            }
            else{
                e.next = cur;
                e = e.next;
            }
            cur = cur.next;
            f = !f;
        }
        o.next = even.next;
        e.next = null;
        
        return odd.next;
    }
}
