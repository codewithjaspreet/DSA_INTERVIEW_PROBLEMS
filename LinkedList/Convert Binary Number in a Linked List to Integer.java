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
