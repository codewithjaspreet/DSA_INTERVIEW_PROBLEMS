class Solution
{

    static class Node{

        Node next;
        int data;

        Node(Node next , int data){

            this.next = next;
            this.data = data;
        }
    }
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        
        
        return identifyLoopCount(head);
        
    }
    
    
    static int identifyLoopCount(Node head) {
 
        Node slowMv = head;
        Node fastMv = head;
        while (slowMv != null && fastMv != null && fastMv.next != null) {
            slowMv = slowMv.next;
            fastMv = fastMv.next.next;
            if(slowMv == fastMv) {
                return loopCount(slowMv);
            }
        }
        return 0;
    }
 
    static int loopCount(Node node) {
 
        int count = 1;
        Node tmp = node;
        while(tmp.next != node) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
        
        
        
        
        
    
}