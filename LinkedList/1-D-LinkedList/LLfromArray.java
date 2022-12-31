import java.util.*;
class LLfromArray {

    static class Node {

        int data;
        Node next;

        Node() {

        }

        Node(int data) {
            this.data = data;
        }
    }

    static Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node cur = head;

        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i]);
            cur.next = temp;
            cur = temp;

        }

        return head;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = s.nextInt();
        }

        Node ans = constructLL(arr);
        while (ans!= null) {

            System.out.print(ans.data + " -> ");
            ans = ans.next;
        }
    }
}