import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindMultipleMissingInteger {
    
    
    public static List<Integer>findDisappearedNumbers(int[] arr)
     {
           HashSet<Integer>hs=new HashSet<>();
           for(int val:arr)
             hs.add(val);
         
           List<Integer>al=new ArrayList<>();
           int n=arr.length;
           for(int i=1;i<=n;i++)
             if(hs.contains(i)==false)
               al.add(i);
         
           return al;
     }     
     
 }

