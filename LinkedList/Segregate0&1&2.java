class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head == null || head.next == null) return head;
        Node zero = new Node(-1);
        Node pzero = zero;
        
        
        Node one = new Node(-1);
        Node pone  = one;
        
        
        Node two = new Node(-1);
        Node ptwo  = two;
        
        Node cur = head;
        
        while(cur != null){
            if(cur.data == 0){
                pzero.next = cur;
                pzero = pzero.next;
            }
            else if(cur.data == 1){
                pone.next = cur;
                pone = pone.next;
            }
            
            else{
                ptwo.next = cur;
                ptwo = ptwo.next;
            }
            cur = cur.next;
        }
         pone.next = two.next; //Importance of writing this above  test case : 2 2 2
        pzero.next = one.next;
       
        ptwo.next = null;
        
        return zero.next;
            
        
        
        // add your code here
    }
}
