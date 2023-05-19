class MinStack {

    Stack<Integer> st;
    Stack<Integer> ss;
    
    public MinStack() {
        
       st = new Stack<>();
       ss = new Stack<>();
    }
    
    public void push(int val) {

        st.push(val);

        // push in supporting stack if it is the first ele or it is less than the
        // current minimum element

        if(ss.size() == 0 || val <= ss.peek()){

            ss.push(val);
        }

    }
    
    public void pop() {

        if(st.size() != 0){

            int ans = st.pop();

            if(ans == ss.peek()){

                ss.pop();
            }
        }
        
    }
    
    public int top() {

        if(st.size() != 0){
            return st.peek();
        }

        return -1;
        
    }
    
    public int getMin() {
        
        if(ss.size() == 0) return -1;

        return ss.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */