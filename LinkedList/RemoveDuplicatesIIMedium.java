class Solution {
    public ListNode deleteDuplicates(ListNode head) {
     if(head == null || head.next == null) return head;
        
     ListNode dummy = new ListNode(-101);
     ListNode itr  = dummy;
     itr.next = head ;// potential unique ele
    
        ListNode cur = head.next;
        
        while(cur != null){
            boolean isLooprun = false;  
            
            while(cur !=null && itr.next.val == cur.val){
                   isLooprun = true;
                    cur = cur.next;
                
            }
            
            if(isLooprun){
                itr.next = cur;
            }
            else{
                itr = itr.next;
            }
            
            if(cur !=null)  cur = cur.next;
            
        }
        
       
        
        return dummy.next;
    }
}
