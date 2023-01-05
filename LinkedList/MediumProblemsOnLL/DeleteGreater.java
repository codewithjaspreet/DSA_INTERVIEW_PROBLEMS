class Solution {

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode removeNodes(ListNode head) {
        head=reverseList(head);
        int max=head.val;
        ListNode nn=new ListNode(max);
        ListNode h1=nn;
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val>=max){
                max=temp.val;
                nn.next=new ListNode(max);
                nn=nn.next;
            }
            temp=temp.next;
        }
        return reverseList(h1);
    }
    
    //reversing the list at the beginning and in the end
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}