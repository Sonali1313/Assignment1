import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
 public class SortArrayList{
 public static void main(String[] args) {
ArrayList<String> arrayList = new ArrayList(); 
arrayList.add("A"); 
arrayList.add("C");
arrayList.add("D");
arrayList.add("Z");
arrayList.add("F");
arrayList.add("J");
arrayList.add("K");
arrayList.add("M");
arrayList.add("L");
arrayList.add("O");     
System.out.println("Before sorting ArrayList=");
 Iterator itr=arrayList.iterator();        
while (itr.hasNext()) {
 System.out.println(itr.next());
     } 
  Collections.sort(arrayList);
  System.out.println("After sorting ArrayList=");  
 Iterator itr1=arrayList.iterator();
 while (itr1.hasNext()) {
	 System.out.println(itr1.next());            
}
 }
 }
 
  
