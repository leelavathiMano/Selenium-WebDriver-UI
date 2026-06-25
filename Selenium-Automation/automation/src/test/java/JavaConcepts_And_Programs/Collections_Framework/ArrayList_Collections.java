package JavaConcepts_And_Programs.Collections_Framework;

import java.util.ArrayList;

public class ArrayList_Collections {
     public static void main(String args[]) {



    //Java Collections is a framework which has the number of classes and interfaces. We have tons for useful classes and functions
    // to store the data and manipulate the data very efficiently and which are making super easy to handle the data
    // We have three interfaces in Collection Framework
    // All Collections framework comes under Util package
    //1. LIST
    //2. SET
    //3. MAP
    //LIST- Is an interface which is the ordered Collections which can have the duplicate elements-- 3 main classes are
    // ArrayList, LinkedList, Vector
    //SET- Cannot contain the duplicate value it has only unique elements
    //MAP- Is contains the Key-value format so we cannot have duplicate keys
        //ArrayList can have the duplicate elements
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<String> arr1 = new ArrayList<String>();
    arr1.add("leela");
        arr1.add("sen");
        arr1.add("prek");
        arr1.add("yash");
        arr1.add("aksh");
        arr1.add("miru");
        arr1.add("vela"); arr1.add("naren");
        System.out.println(arr1);
        arr1.add(3,"janu");
        System.out.println(arr1);
        arr1.remove("aksh");
        System.out.println(arr1);
        arr1.remove(2);
        System.out.println(arr1);
        // to get the value of the particular index we can use get method by passing index to it
        System.out.println(arr1.get(4));
        // to check whether we have particular string present in an array we use contains() method
        System.out.println(arr1.contains("aksh"));
        System.out.println(arr1.contains("sen"));
        // at what index the value of the string has been stored
        System.out.println(arr1.indexOf("yash"));
        System.out.println(arr1.isEmpty());
        System.out.println(arr1.size());








    }

}
