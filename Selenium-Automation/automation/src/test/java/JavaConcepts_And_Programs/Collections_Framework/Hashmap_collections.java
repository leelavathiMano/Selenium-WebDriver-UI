package JavaConcepts_And_Programs.Collections_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap_collections {
   public static void main(String args[]){
       HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(0,"leela");
        hm.put(1,"Preksha");
        hm.put(2,"naren");
        hm.put(3,"senthil");
        hm.put(4,"maheswari");
        System.out.println(hm.get(3));
        hm.remove(4);
        System.out.println(hm.get(2));
        Set<Map.Entry<Integer, String>> s= hm.entrySet();
        Iterator<Map.Entry<Integer, String>> it=s.iterator();
        while(it.hasNext()){
            it.next();
            Map.Entry mp=(Map.Entry)it.next(); // this is to extract the key-value -process called as casting
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }        }
    }



    //hashmap follows the key value pair format
//Difference between hashmap and hashtable
 // In Hashmap we can pass null values aswell, not synchronized and not thread safe
 // Hashtable is not allow the null values and it is thread safe and synchronize
 // We can use the iterator to iterates all the value in hashmap where as in Hashtable we have to use enumerator