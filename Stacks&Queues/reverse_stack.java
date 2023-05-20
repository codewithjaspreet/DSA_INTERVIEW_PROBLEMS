import java.util.Stack;

public class reverse_stack {
    
	public static void reverseStack(Stack<Integer> stack) {
		// write your code 
		

		if(stack.isEmpty()) return;

		int num = stack.peek();

		stack.pop();


		reverseStack(stack);


		insertAtBottom(stack , num);




		
	}

	static void insertAtBottom(Stack<Integer> st , int ele){

		if(st.isEmpty()){

			st.push(ele);
			return;
			
		}

		int top = st.peek();
		st.pop();

		insertAtBottom(st, ele);

		st.push(top);
	}

	

}
