class Solution
{

    static class Node{

        Node next;
        int data;

        Node(int data){
            this.data = data;
        }
    }
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        
        if(head == null || head.next == null) return head;
        
        
        Node middle = findMiddle(head);
        
        Node left = head;
        Node right = middle.next;
        
        middle.next = null;
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        
        Node res = merge(left,right);
        
        return res;
        
    }
    
    static Node findMiddle(Node head){
        
        Node slow = head; Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        return slow;
    }
    
    static Node merge(Node left , Node right){
        
        if(left == null)
        return right;
    
    if(right == null)
        return left;
    
    Node ans = new Node(-1);
    Node temp = ans;
    
    //merge 2 sorted Linked List
    while(left != null && right != null) {
        if(left.data < right.data ) {
            temp.next = left;
            temp = left;
            left = left.next;
        }
        else
        {
            temp.next = right;
            temp = right;
            right = right.next;
        }
    }
    
    while(left != null) {
       temp.next = left;
            temp = left;
            left = left.next;
    }
    
    while(right != null) {
       temp.next = right;
            temp = right;
            right = right.next;
    }
    
    ans = ans.next;
    return ans;
        
        
    }
    
    
}

