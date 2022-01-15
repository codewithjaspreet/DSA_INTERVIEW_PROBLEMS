// Approach 1 : Brute force : traverse each node in both LL
// Time  : O(MXN) , space : O(1)
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    if(headA == null || headB == null) {
        return null;
    }
    
    ListNode tempA = headA;

    
    while (tempA != null) {

        ListNode tempB = headB;
         while (tempB != null) {


            if (tempA == tempB) {
                return tempA;
             }

             tempB = tempB.next;
          }

          tempA = tempA.next;
     }

    
    return null;
 }

// Apprpach 2
// Time complexity  : o(N + M) , Space : O(N); // Using HashSet
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (set.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}

// Approach 3 
// Time complexity : O(n) , space : O(1) // Difference Method , a Bit lenghty but optimal

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int c1 = getCount(headA);
        int c2 = getCount(headB);
        int d;
 
        if (c1 > c2) {
            d = c1 - c2;
            return getans(d, headA, headB);
        }
        else {
            d = c2 - c1;
            return getans(d, headB, headA);
        }
        
        
        
    }
    
    int getCount(ListNode node)
    {
        ListNode current = node;
        int count = 0;
 
        while (current != null) {
            count++;
            current = current.next;
        }
 
        return count;
    }
    
   ListNode getans(int d, ListNode node1, ListNode node2)
    {
        int i;
        ListNode current1 = node1;
        ListNode current2 = node2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return null;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1 == current2) {
                return current1;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
 
        return null;
    }
 
    
      
}


// Approach 4  : Most Optimal : O(N) & O(1)  
// Two pointer Technique
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         
        if(headA == null || headB == null) return null;

        ListNode node1 = headA;
        ListNode node2 = headB;

        while(node1 != node2){

            node1 = node1 == null ? headB : node1.next;
            node2 = node2 == null ? headA : node2.next;
        }

        return node1;
    }
}





