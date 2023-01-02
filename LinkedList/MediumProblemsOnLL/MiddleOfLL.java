import java.util.Scanner;

class MiddleOfLL{

    static class Node{
        Node next;
        int data;
        
        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        public Node(int data) {

            this.data = data;
        }

        
    }
    static Node middle(Node head){

        Node slow = head;
        Node fast = head;


        while(fast !=null && fast.next!= null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        Node  head = new Node(s.nextInt());
        Node cur = head;

        for(int i = 0 ; i < n ;i++){

            Node temp = new Node(s.nextInt());
            cur.next = temp;
            cur = temp;

            
        }

        Node test = head;
        while(test!= null){

           if(test.next!= null) System.out.print(test.data + "->");
           else test = test.next;
        }

        System.out.println('\n');
        System.out.println(middle(head).data);

        s.close();

    }
}