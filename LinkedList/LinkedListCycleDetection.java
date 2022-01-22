//Brute Force : HashSet O(N) space O(N) Time  :  check for duplicacy


public class Solution {
    public boolean hasCycle(ListNode head) {
        
       HashSet<ListNode> hm = new HashSet<>();
       
        
        while(head != null){
            
           if(hm.contains(head)){

               return true;
           }
           hm.add(head);

           head = head.next;

        }
        
        return false;
    }
}




// optimised : Floyd Detection cycle method

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null) return false;
        ListNode slow = head ; ListNode fast = head;
        
        while(fast.next != null  && fast.next.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) return true;
        }
        
        return false;
    }
}