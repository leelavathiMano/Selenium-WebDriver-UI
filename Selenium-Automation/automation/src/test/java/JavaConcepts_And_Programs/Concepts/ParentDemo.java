package JavaConcepts_And_Programs.Concepts;

public class ParentDemo {
       String name= "Rahul";

    public ParentDemo()
    {
        System.out.println("Parent class construtor");

    }
    public void getData()
    {
        System.out.println(" I am parent class");
    }

    public void addNumbers(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

}
