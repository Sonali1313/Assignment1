import java.util.*;
public class HashToObjectArray {
   public static void main(String args[]) {
      Set<Integer> hs = new HashSet<Integer>();
      hs.add(20);
      hs.add(78);
      hs.add(35);
      hs.add(89);
      hs.add(91);
      hs.add(77);
      hs.add(35);     
      System.out.println("Elements in set = "+hs);
      System.out.println("Copying all elements...");
      Object[] obArr = hs.toArray();
      for (Object ob : obArr)
      System.out.println(ob);
   }
}