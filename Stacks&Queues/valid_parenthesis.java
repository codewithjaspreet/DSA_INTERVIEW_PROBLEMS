import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class valid_parenthesis {
    
    static boolean ispar(String x)
    {
        // add your code here
        
        Stack<Character> st = new Stack<>();
        
        Set<Character> set = new HashSet<>();
        set.add('{');
        set.add('[');
        set.add('(');
        
        
        
        for(char c : x.toCharArray()){
            
            if(set.contains(c)){
                
                st.push(c);
            }
            
            else {
                
                if(c == ']'){
                    
                    if(!st.isEmpty() && st.peek() == '[') st.pop();
                    else return false;
                }
                
                if(c == ')'){
                    
                    if(!st.isEmpty() && st.peek() == '(') st.pop();
                    else return false;
                }
                
                if(c == '}'){
                    
                    if(!st.isEmpty() && st.peek() == '{') st.pop();
                    else return false;
                }
            }
        }
        
        return st.isEmpty() ? true:false;
        
    }
}
