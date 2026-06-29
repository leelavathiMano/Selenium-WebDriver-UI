package JavaConcepts_And_Programs.Concepts;

public class finalKeyword {

 final int i=100; // the value of the final variable is constant the value  will not change
    //basically we are restricting the access

    // If we are creating class as a final class that class will not be inherited (extends)to any of the subclass
    public final void getData(){
        System.out.println("leela");
    }
    //final methods are cannot be overridden
    public static void main(String args[]){
        finalKeyword f=new finalKeyword();
        System.out.println(f.i);
        f.getData();
    }
}
//Packages-- are contains the number of classes and interfaces
//two types: 1)Inbuild or pre-defined packages 2) User defined Packages
//1)Inbuild or pre-defined packages
//java.lang package is a inbuilt package will be imported in jave compiler
//  public static void main(String args[]){, int,String
//java.util- all the collections and interfaces are comes under util package  Hashset,Hashmp,ArrayList,Iterator
// eg: import java.util.ArrayList
//2) User defined Packages
// the user will create package manually
// import org.example.Arrays;
//These packages help organize large projects, avoid naming conflicts (by allowing two classes to have
// the same name in different packages), and control access to code
