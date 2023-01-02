import java.util.Scanner;

public class ReverseLLIterative {
    // Node inner class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
   static Node reverseList(Node head) {
        // code here
        Node temp;
        Node cur = head;
        Node prev = null;

        while (cur != null) {

            temp = cur.next;

            cur.next = prev;

            prev = cur;

            cur = temp;
        }

        return prev;
    }

    static Node head; // head of the list

    // method to insert a new node at the beginning of the list
    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want to add to the list: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            push(data);
        }

        // print the list
        System.out.println("The list is: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        Node ans = reverseList(temp);

        System.out.println("The Reverse List is: ");
       
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }

        

        
    }
}
