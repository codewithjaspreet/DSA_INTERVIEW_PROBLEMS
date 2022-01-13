// Iterative Impplementation : 

class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode prev = null;
         ListNode cur = head; 
         while(cur!=null){
           ListNode next = cur.next;
           
           cur.next = prev;
           
           prev = cur;
           
           cur = next;
         }
      return prev;
        
       }
      
     
      
    }

// Recursive Implementaion :
 

class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
       ListNode newHead =  reverseList(head.next);
       
        head.next.next = head;
        head.next = null;
        
        return newHead;
    
    }
}