import java.util.Enumeration;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;
 public class SetViewsFromHash {
  public static void main(String[] args) {    
    Hashtable ht = new Hashtable();       
    ht.put("1","Abc");
    ht.put("2","Pqr");
    ht.put("3","Xyz");  
   Set st = ht.keySet();
   System.out.println("Set created from Hashtable Keys contains :");    
    Iterator itr = st.iterator();
    while(itr.hasNext())
      System.out.println(itr.next());
    st.remove("2"); 
    System.out.println("Hashtable keys after removal from Set are :");
    Enumeration e = ht.keys();
    while(e.hasMoreElements())
      System.out.println(e.nextElement());
  }
}