package JavaConcepts_And_Programs.Collections_Framework;

import java.util.HashSet;

public class HashSet_Collections {
  public static void main(String args[]) {
        //Set- HashSet, treeset, LinkedHashset
        //SET- Cannot contain the duplicate value it has only unique elements
        //Hashset- there is no gurentee that whether the elements are stored in sequential order or not- it will be stored in random order
        HashSet<String> hash = new HashSet<String>();
        hash.add("apple");
        hash.add("orange");
        hash.add("banana");
        hash.add("kiwi");
        hash.add("cherry");
        hash.add("orange");
        System.out.println(hash);
        System.out.println(hash.size());
        System.out.println(hash.remove("kiwi"));
        System.out.println(hash.contains("kiwi"));
        System.out.println(hash.contains("apple"));
        System.out.println(hash.isEmpty());


    }
}
