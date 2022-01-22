class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode mid = getMiddle(head);
        ListNode newhead = mid.next;
        mid.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(newhead);
        
        return mergeTwoLists(l1 , l2);
       
        
    
    }
    
       public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null ) return l2;
        if(l2 == null) return l1;
        if(l2.val < l1.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode res = l1;
        while(l1 != null && l2 != null){
            ListNode tmp = null;
            while( l1 != null && l1.val <= l2.val){
                tmp = l1;
                l1  = l1.next;
            }
            tmp.next = l2;
            
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
 
    }
    
    public ListNode getMiddle(ListNode node){
        if(node == null || node.next == null) return node;
        ListNode slow = node;
        ListNode fast = node;
        while(fast.next != null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }
}