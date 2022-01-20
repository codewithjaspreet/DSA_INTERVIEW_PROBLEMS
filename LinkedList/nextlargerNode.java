// O(N) Space , O(N) time


class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int l = len(head);   
        Stack<Integer> s = new Stack<>();   int[] arr = new int[l];
        ListNode temp = head;
        int i = 0;
        while(temp!=null){
            arr[i] = temp.val;
            temp = temp.next; i++;
        }
        
        ListNode dummy = head;
        int[] ans = nextGreaterElement(s , arr , dummy );
        
        return ans;
        
       
    }
    
    private static int len(ListNode node){
        int count = 0 ;
        ListNode cur = node;
        while(cur !=null){
            count++;
            cur = cur.next;
        }
        
        return count;
    } 
    
    private static int[] nextGreaterElement(Stack<Integer> st , int[] arr , ListNode head){
        int l  = len(head);
        int[] nge = new int[l];
        nge[arr.length - 1] = 0;
        st.push(arr[arr.length - 1]);
        
        for(int i = arr.length - 2 ; i  >=0 ; i--){
            
            while(st.size()  >0  && st.peek() <= arr[i]){
                st.pop();
            }
            
            if(st.size() == 0){
                nge[i] = 0;
            }
            else{
                nge[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        return nge;
    }
}
