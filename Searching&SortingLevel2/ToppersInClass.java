

// brute - Nlogn  //  FULLY SORTED ARRAY


class GFG
{
   void kTop(node arr[],int n)
   {
       // Your code goes here
       Arrays.sort(arr,(a,b)->{
           if(a.marks!=b.marks)
           {
               return b.marks-a.marks;
           }
           else
           {
               return a.index-b.index;
           }
       });
   }
}

//optimised - O(Nlogk)  - min heap priorityQueue not sorted fully

import java.util.*;
import java.io.*;

public class Main {
    
    public static class Pair implements Comparable<Pair>{
        
        int marks;
        int idx;
        
        Pair(int marks  , int idx){
             
             this.marks = marks;
             this.idx = idx;
        }
        
        public int compareTo(Pair o){
            
            if(this.marks != o.marks){
                return this.marks - o.marks;
            }
            else {
               return o.idx  - this.idx;
            }
        }
    }

  public static int[] kToppers(int[]marks, int k) {
    //write your code here
    
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    
    for(int i = 0 ;i < marks.length ; i++){
        
        if(pq.size() < k){
            
            pq.add(new Pair(marks[i] , i));
        }
        
        else if(pq.peek().marks < marks[i]){
            
            pq.remove();
            pq.add(new Pair(marks[i] , i));
        }
    }
    
    int[] ans = new int[k];
    int idx = k-1;
    for(int i  = ans.length  - 1; i >=0 ; i--){
        
        ans[idx] = pq.remove().idx;
        idx--;
    }
    
    return ans;
  }

  public static void main(String[]args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]marks = new int[n];

    for (int i = 0; i < n; i++) {
      marks[i] = scn.nextInt();
    }

    int k = scn.nextInt();

    int[]ans = kToppers(marks, k);

    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }

  }
}