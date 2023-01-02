import java.util.HashSet;

public class LLcycle {

    static class Node {

        Node next;
        int data;

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        // brute force with o(n) space and o(n) time

        static boolean isCycle(Node node) {

            HashSet<Node> set = new HashSet<>();

            while (node != null) {

                if (set.contains(node))
                    return true;

                else {
                    set.add(node);
                    node = node.next;
                }
            }

            return false;

        }

            public boolean hasCycle(Node head) {
                if (head == null) {
                    return false;
                }
                Node slow = head, fast = head;

                while (fast.next != null && fast.next.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;

                    if (fast == slow) {
                        return true;
                    }
                }

                return false;
        }

    }
}
