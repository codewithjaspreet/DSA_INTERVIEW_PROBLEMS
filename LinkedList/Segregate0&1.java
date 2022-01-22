public class Solution {
    public ListNode solve(ListNode A) {
        if(A == null || A.next == null) {
            return A;
        }
        ListNode Zero = new ListNode(-1);
        ListNode One = new ListNode(-1);
        ListNode pz = Zero; ListNode po = One;
        ListNode cur = A;

        
        while(cur != null){
            if(cur.val == 0){
                pz.next = cur;
                pz = pz.next;
            }

            else{
                po.next = cur;
                po = po.next;
            }
            cur = cur.next;
        }
        pz.next = One.next;
        po.next = null;

        return Zero.next;

    }
}
