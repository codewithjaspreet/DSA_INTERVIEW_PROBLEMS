// Approach 1  : Use stack & check reverse with actual
// time : O(N)  & Space : (O(N))
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        Stack<Integer> st = new Stack<>();
        
        ListNode cur = head;
        while(cur!=null){
            st.push(cur.val);
            cur = cur.next;
        }
        
        cur = head;
        while(st.size()  > 0 && cur !=null){
            if(st.pop() != cur.val){
                return false;
            }
            cur = cur.next;
        }
        
        return true;
    }
    
   
}

// Approach 2 : Optimal , use space - o(1) & time  - O(N);
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode mid = Middle(head);
        mid.next = Reverse(mid.next);
        
        mid  = mid.next;
        
        while(mid != null){
            
            if(head.val != mid.val){
                return false;
            }
            mid = mid.next;
            head = head.next;
        }
        
        return true;
        
    
    }
    
    
    public static ListNode Reverse(ListNode head){
        
        ListNode cur = head;
        ListNode prev = null;
        ListNode temp;
        
        while(cur!=null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }
    
    public static ListNode Middle(ListNode head){
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
        
    }
    
   
}
