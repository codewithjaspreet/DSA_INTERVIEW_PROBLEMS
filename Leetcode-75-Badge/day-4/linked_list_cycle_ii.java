public @interface linked_list_cycle_ii {
    
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode node) {

        HashSet<ListNode> set = new HashSet<>();

        while (node != null) {

            if (set.contains(node))
                return node;

            else {
                set.add(node);
                node = node.next;
            }
        }

        return null;

    }
}