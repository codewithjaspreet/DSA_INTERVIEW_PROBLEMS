

// https://leetcode.com/problems/word-search-ii/

// Video - > https://youtu.be/h0kSTsLaZ-U
class Solution {
    
    private static class Node{
        
        Node[] childs = new Node[26];
        String str;
        
    }
    
    public List<String> findWords(char[][] board, String[] words) {
        
       Node root = new Node();
        for(String s : words){
            insert(root , s);
        }
        
        boolean visited[][] = new boolean[board.length][board[0].length];
        ArrayList<String> ans = new ArrayList<>();
        
        
        for(int i = 0 ; i  < board.length ; i++){
            
            for(int j = 0 ; j < board[0].length ; j++){
                
                dfs(board , i,j,root,ans ,visited);
            }  
        }
        
        return ans;
    }
    
    private static void insert(Node cur , String word){
        
        
        for(int i = 0  ;i < word.length() ; i++){
            
            char ch = word.charAt(i);
            
            if(cur.childs[ch-'a'] == null) {
                cur.childs[ch-'a'] = new Node();
                
            }
            
            cur = cur.childs[ch-'a'];
        }
        
        cur.str = word;
        
        
    }
    

    // backtracking -  > flood fill concept used

public static void dfs(char[][] board , int i , int j , Node root,
                       
                                                    ArrayList<String> ans,boolean[][] visited )

   {
    
    if(i < 0 || j < 0 || i>=board.length ||  j>=board[0].length || visited[i][j] == true) return;
        
        if(root.childs[board[i][j] - 'a'] == null ) return;
        
        Node child = root.childs[board[i][j] - 'a'];
      
        if(child.str != null){
            ans.add(child.str);
            
            child.str = null;   // important duplicate ans prevention
        }
    
    visited[i][j] = true;
    dfs(board,i+1,j,child,ans,visited);    
    dfs(board,i-1,j,child,ans,visited);
    dfs(board,i,j+1,child,ans,visited);
    dfs(board,i,j-1,child,ans,visited);

    visited[i][j] = false;


    
    
    
    
    }
}