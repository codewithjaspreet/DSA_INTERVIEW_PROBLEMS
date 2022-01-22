<<<<<<< HEAD
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head.next == null) return head.val;
        
        String sum = "";
        ListNode temp = head;
        while(temp != null){
            sum+= temp.val; temp = temp.next;
        }
    
        int decimal=Integer.parseInt(sum,2);  // convert binary to decimal 2 is the base(redix)
        return decimal;
    }
}






























class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null || l2 == null) return l1!=null ? l1 : l2;
        
        ListNode reverse1 = Reverse(l1);
        ListNode reverse2 = Reverse(l2);
       
        int sum1  = 0  ; int sum2 = 0;
        while(reverse1!=null && reverse2!= null){
            sum1+= reverse1.val;
            sum2 += reverse2.val;
            
            reverse1 = reverse1.next;
            reverse2  = reverse2.next;
        }
        
        int sum3 = sum1 + sum2;
        String s = Integer.toString(sum3);
        String res   = "";
        for(int i = s.length() - 1;i>=0 ; i--){
            res+= s.charAt(i);
        }
        
        
    
        ListNode l3 = new ListNode(0);
        ListNode prev = null;
        
        for(int i = 0 ; i < res.length() ; i++){
            prev = l3;
            ListNode n = new ListNode(Character.getNumericValue(s.charAt(i)));
            prev.next = n;
        }
        
        return l3;
        
        
        
        
    }
    
    public static ListNode Reverse(ListNode node){
        
        ListNode cur = node;
        ListNode prev  = null;
        ListNode temp;
        
        while(cur!=null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }
}
=======
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head.next == null) return head.val;
        
        String sum = "";
        ListNode temp = head;
        while(temp != null){
            sum+= temp.val; temp = temp.next;
        }
    
        int decimal=Integer.parseInt(sum,2);  // convert binary to decimal 2 is the base(redix)
        return decimal;
    }
}
>>>>>>> 7ce938c7fd660a24f87141a693c37861e7b9f750
