<<<<<<< HEAD
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null ) return null;
        ListNode dummy = new ListNode(-101);
        ListNode temp = dummy;
        ListNode cur = head;
        
        while(cur != null){
            while(cur !=null && cur.val == temp.val) {
                cur = cur.next;
            }
             temp.next = cur;
             temp  = temp.next;
             if(cur!=null){
             cur = cur.next;
         }       
            
        }
        
        return dummy.next;
    }
=======
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null ) return null;
        ListNode dummy = new ListNode(-101);
        ListNode temp = dummy;
        ListNode cur = head;
        
        while(cur != null){
            while(cur !=null && cur.val == temp.val) {
                cur = cur.next;
            }
             temp.next = cur;
             temp  = temp.next;
             if(cur!=null){
             cur = cur.next;
         }       
            
        }
        
        return dummy.next;
    }
>>>>>>> 7ce938c7fd660a24f87141a693c37861e7b9f750
}