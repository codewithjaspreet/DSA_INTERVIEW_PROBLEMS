class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node slow = head ; Node fast = head;
         while(fast !=null && fast.next!=null){
             slow = slow.next;
             fast =  fast.next.next;
         }
         
         return slow.data;
    }
}