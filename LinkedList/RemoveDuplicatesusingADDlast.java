class Solution {
    
    static ListNode th = null;
    static ListNode tt = null;
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode cur = head;
        while(cur != null){
            ListNode f = cur.next;
            cur.next = null;
            
            if(tt == null || tt.val != cur.val)
                addLast(cur);
            
            cur = f;
           
        }
        
        
        return th;
       
    }
    
    
    public static void addLast(ListNode node){
        
        if(tt == null){
            th = node;
            tt = node;
        }
        else{
            tt.next = node;
            tt = node;
        }
        
    }
}
