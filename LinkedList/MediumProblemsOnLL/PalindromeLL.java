import java.util.*;
public class PalindromeLL {
    

    static class Node{
        Node next;
        int data;
        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        
    }

    // brute   - stack space - o(n)
    static boolean isPalindrome(Node head){

        Stack<Node> st= new Stack<>();

        Node temp = head;
        while(temp != null){

            st.push(temp);
            temp = temp.next;
        }

        temp = head;

        while(st.size() > 0 && temp != null){
            

            if(st.pop().data != temp.data) return false;

            temp = temp.next;

        }

        return true;
    }
}
