package JavaConcepts_And_Programs.Concepts;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_interface_Hashset_collections {
       public static void main(String args[]){
        HashSet<String> hs=new HashSet<String>();
        hs.add("UK");
        hs.add("USA");
        hs.add("INDIA");
        hs.add("FRANCE");
        hs.add("SRI LANKA");
        hs.add("RUSSIA");
        System.out.println(hs);
        //Returns an iterator over the elements in this set. The elements are returned in no particular ord
        // to traverse through all the values in set
     Iterator<String> it= hs.iterator();
     while(it.hasNext()) {
         System.out.println(it.next());
     }
    }

}
