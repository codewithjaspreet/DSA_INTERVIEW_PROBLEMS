
// Reverse  using addFirst Method 
// avoid null exception used in several ques
// reverse in k -groups **
static ListNode th = null;
static ListNode tt = null;
public static void addFirst(ListNode node){
    
    if(th == null){
        th = null;
        tt = null
    }

    else{
        node.next = th;
        th = node;
    }
}


public static ListNode Reverse(ListNode head){

    ListNode curr = head;

    while(cur !=null) {

        ListNode  f = cur.next;
        cur.next  = null;
        addFirst(cur);

        cur = f;

    }

    return th; 
}