import java.util.TreeSet;
public class Example_TreeSet {
   public static void main(String[] args) {
      TreeSet<Integer> treeSet = new TreeSet<Integer>();
      treeSet.add(2);
      treeSet.add(100);
      treeSet.add(234);
      treeSet.add(3000);
      treeSet.add(99);
      treeSet.add(123);
      treeSet.add(65);      
      System.out.println("Lowest value = " + treeSet.first());
      System.out.println("Highest value = " + treeSet.last());
   }
}