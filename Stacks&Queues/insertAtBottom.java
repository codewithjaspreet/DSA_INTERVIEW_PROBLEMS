import java.util.* ;
public class insertAtBottom 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
    // Write your code here


       update(myStack , x , myStack.size() , 0 );

       return myStack;


  }

  static void update(Stack<Integer> st , int x , int size ,int count ){

    if(count == size -1 ){

      int cur = st.pop();

      st.push(x);

      st.push(cur);

      return;
    }

    int num = st.peek();

    st.pop();

    update(st, x, size, count + 1);


    st.push(num);

  }
}
