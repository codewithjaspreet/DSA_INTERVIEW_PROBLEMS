import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = Integer.parseInt(scn.nextLine());
    String ceo = "";

    HashMap<String, HashSet<String>> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String[] parts = scn.nextLine().split(" ");
      String emp = parts[0];
      String man = parts[1];

      if (man.equals(emp)) {
        ceo = man;
        continue;
      }

      if (map.containsKey(man)) {
        HashSet<String> emps = map.get(man);
        emps.add(emp);
      } else {
        HashSet<String> emps = new HashSet<>();
        emps.add(emp);
        map.put(man, emps);
      }
    }

    HashMap<String, Integer> ans = new HashMap<>();
    size(map, ceo, ans);

    for (String emp : ans.keySet()) {
      System.out.println(emp + " " + ans.get(emp));
    }
  }

  public static int size(
    HashMap<String, HashSet<String>> map,
    String man,
    HashMap<String, Integer> ans
  ) {
    if(map.containsKey(man) == false){
      ans.put(man, 0);
      return 1;
    }

    int sz = 0;
    
    for (String emp : map.get(man)) {
      int cs = size(map, emp, ans);
      sz += cs;
    }
    ans.put(man, sz);
    return sz + 1;
  }
}


                        