
// https://leetcode.com/problems/design-add-and-search-words-data-structure/

// Video - > https://youtu.be/T0Cml8tb9UA

class WordDictionary {
    
    private class Node {
          Node[]childs;
          boolean isEnd;
          Node() {
            childs = new Node[26];
          }
    
          public boolean find(String word, int i) {
            if (i == word.length()) {
              return isEnd;
            }
    
            if (word.charAt(i) == '.') {
              for (Node child : childs) {
                if (child != null && child.find(word, i + 1)) {
                  return true;
                }
              }
              return false;
            } else {
              if (childs[word.charAt(i) - 'a'] == null) {
                return false;
              } else {
                return childs[word.charAt(i) - 'a'].find(word, i + 1);
              }
            }
          }
        }
        
     
    
        final private Node root;
        public WordDictionary() {
          root = new Node();
        }
    
        /** Adds a word into the data structure. */
        public void addWord(String word) {
          Node curr = root;
    
          for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
    
            if (curr.childs[ch - 'a'] == null) {
              curr.childs[ch - 'a'] = new Node();
            }
            curr = curr.childs[ch - 'a'];
          }
    
          curr.isEnd = true;
        }
    
        /**
         * Returns if the word is in the data structure. A word could contain the dot
         * character '.' to represent any one letter.
         */
        public boolean search(String word) {
          return root.find(word, 0);
        }
    
      }
        
    
    
    /**
     * Your WordDictionary object will be instantiated and called as such:
     * WordDictionary obj = new WordDictionary();
     * obj.addWord(word);
     * boolean param_2 = obj.search(word);
     */