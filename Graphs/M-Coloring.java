// graph coloring - > m coloring problem
class solve 
{
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int m){
       if(i == G.length) return true;
       
       for(int c=1; c<=m; c++){
           if(isSafe(G, color, i, c)){
               color[i] = c;
               if(graphColoring(G, color, i+1, m)) return true;
               color[i] = 0;
           }
       }
       
       return false;
   }
   
   public static boolean isSafe(List<Integer>[] G, int[] color, int i, int c){
       for(int adj : G[i]){
           if(color[adj] == c) return false;
       }
       return true;
   }
}
