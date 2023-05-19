import java.util.Stack;

public class minStackwithoutspace {
    

    private int minEle;
    private Stack<Integer> st;

    minStackwithoutspace() {
        st = new Stack<>();
    }


    int getMin() {
        if (st.size() == 0) return -1;

        return minEle;
    }

    void push(int val){

        if (st.size() == 0) {
            st.push(val);
            minEle = val;
        } else if (val >= minEle) {
            st.push(val);
        } else {
            st.push(2 * val - minEle);
            minEle = val;
        }

    }

    int pop() {
        if (st.size() == 0) return -1;

        if (st.peek() >= minEle) {
            return st.pop();
        } else {
            minEle = 2 * minEle - st.peek();
            return st.pop();
        }
    }

    int top() {
        if (st.size() == 0) return -1;

        if (st.peek() >= minEle) {
            return st.peek();
        } else {
            return minEle;
        }
    }

    public static void main(String[] args) {
        minStackwithoutspace st = new minStackwithoutspace();

        st.push(5);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(4);

        System.out.println(st.getMin());
        st.pop();
        
}
}