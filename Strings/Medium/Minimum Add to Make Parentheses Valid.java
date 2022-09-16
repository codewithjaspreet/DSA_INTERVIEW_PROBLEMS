// time  complexity: O(n) space complexity: O(1)
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(')
                st.push(c);

            else {

                if (st.size() > 0 && st.peek() == '(')
                    st.pop();

                else
                    st.push(c);
            }

        }

        return st.size();

        // optimise o(n) time and o(1) space

        // int open = 0 ; int close = 0;

        // for(int i = 0 ; i<s.length() ; i++){

        // char c = s.charAt(i);
        // if(c == '(') open ++;

        // else

        // if(open != 0) open--;

        // else close++;
        // }

        // return open + close;
    }
}
