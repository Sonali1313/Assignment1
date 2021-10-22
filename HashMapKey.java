import java.util.*;
public class HashMapKey  {
    public static void main(String[] args)
    {       
        HashMap<Integer, String>
            map = new HashMap<>();        
        map.put(1, "Welcome");
        map.put(2, "World");
        map.put(3, "Welcome World");        
        int keyToBeChecked = 2;        
        System.out.println("HashMap: " + map);  
          Iterator<Map.Entry<Integer, String> >
            iterator = map.entrySet().iterator();        
        boolean isKeyPresent = false;        
        while (iterator.hasNext()) {            
            Map.Entry<Integer, String> entry = iterator.next();            
            if (keyToBeChecked == entry.getKey()) {  
                isKeyPresent = true;
            }
        }        
        System.out.println("Does key " + keyToBeChecked  + " exists: "  + isKeyPresent);
    }
}