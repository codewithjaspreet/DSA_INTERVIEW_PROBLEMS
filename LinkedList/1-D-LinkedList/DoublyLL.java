
class Solution {

        static class Node {
        int data;
        Node next;
        Node prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }

    Node constructDLL(int arr[]) {
        
        Node node  = new Node(arr[0]);
        
        Node cur = node;
        
        for(int i = 1 ; i < arr.length ;i++){
            
            Node temp = new Node(arr[i]);
            cur.next = temp;
            cur = temp;
            // cur.prev  = new Node(arr[i-1]);
            
            
            
        }
        return node;
        
        // Code here
    }
}