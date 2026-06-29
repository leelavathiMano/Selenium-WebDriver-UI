package JavaConcepts_And_Programs.Collections_Framework;

import java.util.ArrayList;

public class example_ArrayList {
public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        System.out.println(a);
        //a.removeFirst();
        System.out.println(a);
        System.out.println(a.contains("orange"));
        if(a.contains("orange")){
            System.out.println("found orange");
        }
        else{
            System.out.println("not found");
        }
        System.out.println(a.size());
        for(int i=0;i<a.size();i++){
            System.out.println(a.indexOf(a.get(i))+ ","+a.get(i));
        }

    }
}
