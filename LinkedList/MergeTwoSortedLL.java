<<<<<<< HEAD

 // Approach 1 : space (O(N1+N2)) , TIME: O(N1+N2);
class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1  == null || l2 == null){
            return l1!=null ? l1 : l2;
        }

        ListNode head=new ListNode(-1);

        ListNode curr=head;

        while(l1!=null && l2!=null){

            if(l1.val<l2.val){

                curr.next=l1;

                curr=curr.next;

                l1=l1.next;

            }

            else{

                curr.next=l2;

                curr=curr.next;

                l2=l2.next;

            }

        }

        

        if(l1!=null){

            curr.next=l1;

        }

        

        if(l2!=null){

            curr.next=l2;

        }

        return head.next;

    }

}

// Approach 2 : In -Place , time = O(N1+N2) , space : O(1)

class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null ) return l2;
        if(l2 == null) return l1;
        if(l2.val < l1.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode res = l1;
        while(l1 != null && l2 != null){
            ListNode tmp = null;
            while( l1 != null && l1.val <= l2.val){
                tmp = l1;
                l1  = l1.next;
            }
            tmp.next = l2;
            
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
 
    }

=======

 // Approach 1 : space (O(N1+N2)) , TIME: O(N1+N2);
class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1  == null || l2 == null){
            return l1!=null ? l1 : l2;
        }

        ListNode head=new ListNode(-1);

        ListNode curr=head;

        while(l1!=null && l2!=null){

            if(l1.val<l2.val){

                curr.next=l1;

                curr=curr.next;

                l1=l1.next;

            }

            else{

                curr.next=l2;

                curr=curr.next;

                l2=l2.next;

            }

        }

        

        if(l1!=null){

            curr.next=l1;

        }

        

        if(l2!=null){

            curr.next=l2;

        }

        return head.next;

    }

}

// Approach 2 : In -Place , time = O(N1+N2) , space : O(1)

class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null ) return l2;
        if(l2 == null) return l1;
        if(l2.val < l1.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode res = l1;
        while(l1 != null && l2 != null){
            ListNode tmp = null;
            while( l1 != null && l1.val <= l2.val){
                tmp = l1;
                l1  = l1.next;
            }
            tmp.next = l2;
            
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
 
    }

>>>>>>> 7ce938c7fd660a24f87141a693c37861e7b9f750
}