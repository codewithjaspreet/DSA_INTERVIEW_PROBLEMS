import java.util.Scanner;
import java.util.Stack;

public class redundant_brackets {
    

    public static int checkRedundancy(String s) {
        // code here
        
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            
            if(c == '(' || c == '+' || c == '-' || c == '*' || c == '/') st.push(c);
            
            else{
                
               if(c == ')'){
                   
                   boolean isRed = true;
                   
                   while(st.peek() != '('){
                       
                       char ch  = st.peek();
                       
                       if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                           
                           isRed = false;
                       }
                       
                       st.pop();
                   }
                   
                   
                   if(isRed == true) return 1;
                   st.pop();
                   
                   
                }
               }
            }
            
            return 0;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            String brackets = s.nextLine();

            System.out.println(checkRedundancy(brackets));
            
        }
        
        
    }

        

