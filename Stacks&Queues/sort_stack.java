import java.util.* ;
public class sort_stack {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.

		if(stack.size() == 0) return;

		int top = stack.peek();

		stack.pop();


		sortStack(stack);

		insertInSortedManner(stack , top);
	}


	static void insertInSortedManner(Stack<Integer> st , int element){

		if(st.isEmpty() || (!st.isEmpty() &&  st.peek() < element )){

			st.push(element);
			return;
		}

		int top = st.peek();

		st.pop();

		insertInSortedManner(st, element);

		st.push(top);



	}
}