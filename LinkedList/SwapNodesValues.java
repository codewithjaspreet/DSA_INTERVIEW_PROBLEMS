// swap nodes in LL , ( swapping values)

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode cur = head;
        int c = 0;
        while(cur !=null) {
             c++; 
             cur = cur.next;
        }
        cur = head;
        
        int l = c  - k + 1;
        
        if(l == k) return head;
        
        int node1 = 0 ; int node2 = 0;
        
        for(int i = 1; i<=c ; i++){
            if(i == k) node1 = cur.val;
            
            if(i == l) node2 = cur.val;
            
            cur = cur.next;
        }
        
         cur = head;
         for(int i = 1; i<=c ; i++){
            if(i == k) cur.val = node2;
            
            if(i == l) cur.val = node1;
            
            cur = cur.next;
        }
        
        return head;
        
        
    }
}
