import java.util.StringTokenizer;

class Solution {
    
    public static class Node{
        
        Node[] childs = new Node[26];
        String str ;
    }
    public String replaceWords(List<String> dictionary, String sentence) {

        
        Node root = new Node();
        
        for(String s :dictionary ){
            
            insert(root , s);
        }
        
        StringBuilder ans = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(sentence);
        
        
        while(st.hasMoreTokens()){
            
            String word = st.nextToken();
            
            String prefix = searchPrefix(root  , word);
            
            if(prefix != null){
                ans.append(prefix);
            }
            else{
                ans.append(word);
            }
            
            ans.append(" ");
        }
        
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
        
        
        
        
    }
    
    public static void insert(Node root , String s){
        
        Node cur  = root;
        
        for(int i = 0 ; i < s.length() ; i++){
            
            char ch = s.charAt(i);
            
            if(cur.childs[ch-'a'] == null) {
                
                cur.childs[ch-'a'] = new Node();
            }
            
            
            cur = cur.childs[ch-'a'];
            
            if(cur.str != null ){
                
                return;
            }
            
        }
        
        cur.str = s;
    }
    
    public static String searchPrefix(Node root , String s){
        
        
        for(int i = 0 ; i < s.length() ; i++){
            
            char ch = s.charAt(i);
            if(root.childs[ch-'a'] == null) return null;
            
            root = root.childs[ch-'a'];
            
            if(root.str!=null) return root.str;
        }
        
        
        return null;
    }
}