// Brute : O(N/2) + O(N) , O(1) space  : Maintain Counter
class Solution {

    public ListNode middleNode(ListNode head) {

        if(head.next==null)

            return head;
        int count = 0;

        ListNode temp = head;

        while(temp!=null) {
           temp=temp.next;

            count++;
        }

        int n=0;  temp = head;

        while(n<(count/2)){
            temp = temp.next;  n++;

        }
        return temp;

    }
 }

// Optimised : O(N/2) , O(1) Space: Slow Fast Pointer


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
