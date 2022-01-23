import java.util.*;

public class Constructor {
  public static class Node {
    int data;
    Node left;
    Node right;
    Node() {
    }
    Node(int data) {
      this.data = data;
    }
  }
  public static class Pair {
    Node node;
    int state;

    Pair() {
    }

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[]arr) {
    Node root = new Node(arr[0]);

    Stack< Pair>st = new Stack< >();
    Pair root_pair = new Pair(root, 1);

    st.push(root_pair);
    int idx = 1;

    while (st.size() > 0) {
      Pair top = st.peek();

      if (top.state == 1) {
        //waiting for left child
        top.state++;
        if (arr[idx] != null) {
          Node lc = new Node(arr[idx]);
          top.node.left = lc;

          Pair lcp = new Pair(lc, 1);
          st.push(lcp);
        }
        idx++;
      }
      else if (top.state == 2) {
        //waiting for right child
        top.state++;
        if (arr[idx] != null) {
          Node rc = new Node(arr[idx]);
          top.node.right = rc;

          Pair rcp = new Pair(rc, 1);
          st.push(rcp);
        }
        idx++;
      }
      else if (top.state == 3) {
        st.pop();
      }
    }
    return root;

  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = " <- " + node.data + " -> ";

    String left = (node.left == null) ? "." :  "" + node.left.data;
    String right = (node.right == null) ? "." : "" + node.right.data;

    str = left + str + right; 

    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int sizeOfTree(Node node){
               
    if(node == null) return 0;
    int l = sizeOfTree(node.left);
    int r = sizeOfTree(node.right);

    int t = l + r + 1;

    return t;


}
  public static int sumfTree(Node node){
    
    if(node == null) return 0;
    int l = sumfTree(node.left);
    int r = sumfTree(node.right);

    int t = l + r + node.data;

    return t;


}
  public static int MaxofTree(Node node){
    
    if(node == null) return Integer.MIN_VALUE;
    int l = MaxofTree(node.left);
    int r = MaxofTree(node.right);


    int t = Math.max(l, r);
    t = Math.max(t, node.data);

    return t;


}
   // depth of the deepest Node
  public static int heightofTree(Node node){
    
    if(node == null) return -1;  // return -1 in edges & 0  in case of nodes
    int l = heightofTree(node.left);
    int r = heightofTree(node.right);


    return Math.max(l,r)+1;
    



}

 // Level Order Traversal
public static void levelOrder(Node node) {
        
  Queue<Node> mq = new ArrayDeque<>();
  mq.add(node);

  while(mq.size() > 0){
       int count  = mq.size();
       for(int i = 0 ; i < count ; i++){
           node = mq.remove();
           System.out.println(node.data + " ");

           if(node.left != null){
               mq.add(node.left);
           }
           
           if(node.right != null){
              mq.add(node.right);
          }
       }
  } 
}


  public static void main(String[]args) {
    Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

    Node root = construct(arr);
    // display(root);
    // System.out.println(sizeOfTree(root));
    // System.out.println(sumfTree(root));
    // System.out.println(MaxofTree(root));
    // System.out.println(heightofTree(root));
    levelOrder(root);
  }
}

