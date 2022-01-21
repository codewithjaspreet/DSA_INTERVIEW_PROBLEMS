// O(N) space  && O(N) time : 

class Solution {
    public int pairSum(ListNode head) {
        if(head.next == null) return head.val;
        int c = 0;
        ListNode cur = head;
        while(cur!=null){
            c++; 
            cur = cur.next;
        }
        int[] arr = new int[c];
        
        cur = head; int i = 0;
        while(cur !=null){
            arr[i] = cur.val;
            i++; cur = cur.next;
        }
        
        int left = 0; 
        int right = arr.length -1;
        
        int max = Integer.MIN_VALUE;
        while(left <= right){
            
            if(arr[left] + arr[right] > max) max = arr[left] + arr[right]; 
            
            left++; right--;
        }
        
        return max;
        
    }
}
