// Time : O(N) , space : O(1)

class Solution {
    public void reorderList(ListNode head) {
        ListNode mid = getMiddle(head);
        ListNode first = head;
        ListNode second = Reverse(mid.next);
        mid.next = null;

    // merge LL        
        while(second != null){
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;
        first.next = second;
        second.next = temp1;
        first = temp1;
        second = temp2;
        
        }
        
    }
        
  // Middle Node of LL
    private static ListNode getMiddle(ListNode node){
        ListNode slow = node; ListNode fast = node;
        
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast =fast.next.next;
            
        }
        
        return slow;
    }
    
  
  // Reverse LL
    private static ListNode Reverse(ListNode node){
        ListNode prev= null;
        ListNode cur  = node;
        ListNode temp;
        
        while(cur !=null){
            temp = cur.next;
            cur.next = prev;
            prev  = cur;
            cur = temp;
        }
        return prev;
    }
}
