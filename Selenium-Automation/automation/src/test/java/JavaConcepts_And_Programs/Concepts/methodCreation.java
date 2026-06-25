package JavaConcepts_And_Programs;

public class methodCreation extends methodCreation2{//inheritance
    public static void main(String args[]){
         // what is method- Method is a kind of block which has the set of lines of codes which define the
        //functionality
        //eg: main is the method always the execution will starts from the main method
        //to access method we need to create of class object or instances
        //to access the other class methods we should create a class object of the sub class in the main class or
        //else we can inherits the properties or methods by using extends keyword
        // If you are declaring access modifiers as a private u cannot call those methods in another main class
        // If you mark the method or class with the static keyword then no need of creating a object or instances
methodCreation mc=new methodCreation();
mc.getData();
String name= mc.validateData();
System.out.println(name);
System.out.println("leela");
mc.getMyData();
        methodCreation3 m3= new methodCreation3();
      m3.getSchoolNames();
      getPlace();

    }
    public void getData(){
        System.out.println("Hello Leela");
    }
    public String validateData(){
        System.out.println("Hey Hi");

        return "Leelavathi Manoharan";
    }
}
