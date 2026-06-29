package JavaConcepts_And_Programs.Concepts;

public class staticVaraibles {
     // instance variables-- the variables which are decalred inside the class and outside of menthods or constructors are called instance variables
    //They are stored in heap memory as part of the object they belong to.
    // When we create the object or instance few variables are getting updated is called instance variables , these variables are changed object to object

    String name;     //instance variables
    String address;
    String city;
    static int k;
    static String country;
    static String state="Karnataka";// static variables created inside the class with static keyword it is also known as class  variables .it
    // will be shared among all instances
    //if we are changing the value of the static variable it will be applied to all the instances
    static int i=0; // this 'i' will be shared with all objects(obj,obj1)
    int j=0;
//Static block means inside the static if we are creating any variables which will be considered as static block
    //They are executed before the main method and even before any objects are instantiated.
    static {
         k=10;
    country="india";
}
    public staticVaraibles(String name,String address,String city){
        this.name=name;
        this.address=address;
        this.city=city;
        i++; // first it will increment by 1(obj) and then increment by 2(obj2)
        System.out.println(i);
        j++;
        System.out.println(j);// non static variables remains as 0 only

    }
    public void getName(){
        System.out.println(name);
    }
    public void getAddress(){
        System.out.println(address+","+city+","+state);
    }
    //static method will access only the static variables
    public static void getState(){
        System.out.println(state);

    }
    public static void main(String args[]){
        System.out.println(staticVaraibles.k);
        System.out.println(staticVaraibles.country);
        staticVaraibles obj=new staticVaraibles("leela","bommasandra","Bangalore");
        staticVaraibles obj1=new staticVaraibles("preksha","hebbal","Bangalore");
        obj.getName();
        obj1.getName();
        obj.getAddress();
        obj1.getAddress();
        staticVaraibles.getState();
   System.out.println(staticVaraibles.i);


    }

}
