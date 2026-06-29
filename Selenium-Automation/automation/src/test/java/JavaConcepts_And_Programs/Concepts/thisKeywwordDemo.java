package JavaConcepts_And_Programs.Concepts;

public class thisKeywwordDemo {

 int a =30;
    public void getData(){

        //this keyword is a reference variable which refers to the current object with in a class
        //The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name
        //this can also be used to:
        //1-Invoke current class constructor
        //2-Invoke current class method
        //3-Return the current class object
        //4-Pass an argument in the method call
        //5-Pass an argument in the constructor call
        int a=20;

int b=a+ this.a;
System.out.println(b);
System.out.println(this.a);

    }
    public static void main(String args[]){
        thisKeywwordDemo k=new thisKeywwordDemo();
        k.getData();
    }
}
