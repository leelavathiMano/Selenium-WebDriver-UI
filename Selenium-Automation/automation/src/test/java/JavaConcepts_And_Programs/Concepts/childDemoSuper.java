package JavaConcepts_And_Programs.Concepts;

public class childDemoSuper extends ParentDemo{
        String name="Leelavathi";

    public childDemoSuper(){
        super();// to call the parent constuctor to the child class we should use super constructor
        System.out.println("Child constructor");
    }
        public void getStringData(){
            System.out.println(name);
            //Super is a keyword which refers the parent class variables or methods and it shoulb defined outsode of the main method in the parent class
            // when the same variable or methods are present in the both child and parent class to differentiate that we should use the super keyword
            System.out.println(super.name);
        }
        public void addNumbers(int a, int b){
            int c=a+b;
            System.out.println(c);
            super.addNumbers(10,20);
        }// to call the parent class method in the child class we should use super.methodname
    public static void main(String args[]){
        childDemoSuper c=new childDemoSuper();
           c.getStringData();
           c.addNumbers(4,6);
           c.addNumbers(20,34);
    }


}
