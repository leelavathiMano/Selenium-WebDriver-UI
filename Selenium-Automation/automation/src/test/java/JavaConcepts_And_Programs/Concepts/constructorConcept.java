package JavaConcepts_And_Programs;

public class constructorConcept {
      // Constructor name should be same as class name
    // Constructor does not have any return type
    // constructor is a special block of code that is automatically called when an object of a class is created
    //Constructors can have access modifiers like public, private, or protected
    // Internally If we dont define constructor then compiler will call default constructor

    public constructorConcept(){ //Default constructor
        System.out.println("Explicit constructor");
    }
    public void getInfor(){
        System.out.println("Normal Method");
    }
    public constructorConcept(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public constructorConcept(String s){ //Default constructor
        System.out.println("Explicit constructor");
        System.out.println(s);
    }
    public static void main(String args[]){
        constructorConcept c=new constructorConcept(); //Default constructor
        constructorConcept c1=new constructorConcept(10,3); //Parameterized constructor
        constructorConcept c2=new constructorConcept("Senthil");


    }
    //Types of constructor-- Default constructor and Parameterized constructor

}
