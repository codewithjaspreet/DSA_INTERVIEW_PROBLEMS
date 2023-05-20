import java.util.Stack;

public class delete_middle {
    
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        
        solve(s , sizeOfStack ,0);
    } 
    
    
    void solve(Stack<Integer> s , int size,int count){
        
        
        if(count == size / 2){
            
            s.pop();
            return;
        }
        
        int num = s.peek();
        
        s.pop();
        
        solve(s , size , count + 1);
        
        s.push(num);
        
    }
}
