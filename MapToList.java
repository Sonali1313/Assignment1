import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class MapToList {
   public static void main(String args[]){
      Map<Integer, String> myMap = new HashMap<>();
      myMap.put(001, "Abc");
      myMap.put(002, "Pqr");
      myMap.put(003, "Xyz");
      myMap.put(004, "Hij");
      ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
      ArrayList<String> valueList = new ArrayList<String>(myMap.values());
      System.out.println("contents of the list holding keys the map ::"+keyList);
      System.out.println("contents of the list holding values of the map ::"+valueList);
   }
}