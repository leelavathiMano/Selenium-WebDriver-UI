package JavaConcepts_And_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]) {
        // ArrayList is a class where we can store the differnt data types of values or input in one varible
        //we can increase the size of the array at any time size is not fixed
        // dynamic array
        //in Array we can add the data in sequential manner where as in Arraylist we can add anywhere from the arraylist

        //diff array and arraylist
        //to get the size of the array we use length method where as in Array list is size() method
        ArrayList<String> a = new ArrayList<>();
        a.add("Leela");
        a.add("Preksha");
        a.add("senthil");
        a.add("maheswari");
        a.add("Naren");
        a.add("sds");
        System.out.println(a.get(3));
        a.remove(5);
        System.out.println("the names are" + a);
        System.out.println("================================");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));

        }
        System.out.println("======================");
        //Enhanced for loop
        for (String s : a) {
            System.out.println(s);

        }
        //to find if any elements present in the array list or not
        System.out.println(a.contains("naren"));
        //we can convert the arrays into arraylist like...
        //List is a super class of ArrayList
        String[] name = {"Leela", "Preksha", "senthil", "Naren", "maheswari"};
        List<String> nameArrayList = Arrays.asList(name);
        // nameArrayList.contains("Naren");

        //Diff ways to construct the arraylist are
        ArrayList<Integer> a1 = new ArrayList<>();//basic creation- the default initial capacity is 10
        ArrayList<String> a2 = new ArrayList<>(20);//It creates the empty arraylist with the initial capacity of 20
        ArrayList<Integer> a3 = new ArrayList<>(a1);// it creates the Arraylist contains supplied elements of collection

        //how do u increase the size of the arraylist
        //default is 10 now increase by 30
        ArrayList<Integer> a4 = new ArrayList<>();
        a4.ensureCapacity(30);
        // how to decrease the size of the arraylist
        a4.trimToSize();
        //How do you find out whether the given ArrayList is empty or not?
        System.out.println(a.isEmpty());
        //How do you get the position of a particular element in an ArrayList
        System.out.println(a.indexOf("senthil"));
        //Array to Arraylist conversion
        List<String> NameArr=  Arrays.asList(name);
        //ArrayList to array
        Object[] name1= a.toArray();
        for(Object obj:name1){
            System.out.println(obj);
        }

        //replace the element with the particular element in arraylist
        //set method will be used to replace the particular element
        ArrayList<String> sname= new ArrayList<>();
        sname.add("ken");
        sname.add("joe");
        sname.add("kev");
        sname.add("wid");
        sname.add("quency");
        sname.add("wincy");
        sname.add("bharathi");
        sname.set(4,"Leela");
        ///How do you insert an element at a particular position of an ArrayList
        sname.add(2,"smith");
        //How do you remove an element from a particular position of an ArrayList?
        sname.remove(2);
        //How do you remove the given element from an ArrayList
        sname.remove("wid");
        System.out.println(sname);
        for(int g=0;g<sname.size()-1;g++){
            System.out.println(sname.get(g));
        }
        System.out.println(sname.get(4));
        System.out.println("=============================");
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println("=============================");
        //How do you retrieve a portion of an ArrayList
        System.out.println(numbers.subList(2,6));
        //How do you join two ArrayLists
        ArrayList<Integer> numbers1=new ArrayList<>();
        numbers1.add(11);
        numbers1.add(13);
        numbers1.add(15);
        numbers1.add(17);
        numbers1.add(18);
        numbers1.add(19);
        numbers1.add(100);
        System.out.println(numbers1);
        numbers.addAll(numbers1);
        System.out.println(numbers);

        //to remove all elements in the defined array
        numbers.clear();
        System.out.println(numbers);

    }

}
