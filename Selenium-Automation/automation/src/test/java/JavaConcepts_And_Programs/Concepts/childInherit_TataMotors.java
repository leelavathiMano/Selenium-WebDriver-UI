package JavaConcepts_And_Programs;

public class childInherit_TataMotors extends inheritanceConcept_Vehicle{
    public static void main(String args[]){
        childInherit_TataMotors c1=new childInherit_TataMotors();
        c1.color();
        c1.engine();
        c1.speed();

    }
    public void color(){
System.out.println("blue");
    }
}
// Java does not allow multiple inheritances which means  child class cannot inherit the multiple parents
// eg: class z extends X,Y

// class A(){
// int i=10;
// }
//class B extends A(){
// i=20;
//}
// pulic class mainclass(){
// A a=new B();
// if u r writing like this object of the class B should refer the properties of Class A then output will be 10.
// System.out.println(a.i)
// eg: Webdriver driver=new Chromedriver();


