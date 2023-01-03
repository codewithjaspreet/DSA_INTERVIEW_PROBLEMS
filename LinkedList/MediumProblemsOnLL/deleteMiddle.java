public class deleteMiddle {

    static class Node{
        Node next;
        int data;
    }
    Node deleteMid(Node head) {
        
         if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
 
        // Initialize slow and fast pointers
        // to reach middle of linked list
        Node slow_ptr = head;
        Node fast_ptr = head;
 
        // Find the middle and previous of middle.
        Node prev = null;
 
        // To store previous of slow_ptr
        while (fast_ptr != null
&& fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
        }
 
        // Delete the middle node
        prev.next = slow_ptr.next;
 
        return head;
        
        
        
    }
    
}