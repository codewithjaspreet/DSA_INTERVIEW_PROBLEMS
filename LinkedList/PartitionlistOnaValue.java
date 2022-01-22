class Solution {
    public ListNode partition(ListNode head, int x) {
        
        if(head == null || head.next == null) return head;
        ListNode smaller = new ListNode(-1);
        ListNode larger = new ListNode(-1);
        ListNode ps = smaller;
        ListNode pl = larger;
        
        ListNode cur = head;
        
        while(cur != null){
            
            if(cur.val < x){
                ps.next = cur;
                ps = ps.next;
            }
            else{
                pl.next = cur;
                pl = pl.next;
            }
            cur = cur.next;
        }
        ps.next= larger.next ;
        pl.next = null;
        
        
        return smaller.next;
    }
}
