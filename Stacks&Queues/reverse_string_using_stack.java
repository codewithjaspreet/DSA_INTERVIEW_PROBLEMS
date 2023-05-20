import java.util.Stack;

public class reverse_string_using_stack {

    public String reverse(String S){
        //code here
        
        Stack<Character> st = new Stack<>();
        
        for(char c : S.toCharArray()){
            
            st.push(c);
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
            
            sb.append(st.pop());
        }
        
        
        return sb.toString();
    }
    
}
