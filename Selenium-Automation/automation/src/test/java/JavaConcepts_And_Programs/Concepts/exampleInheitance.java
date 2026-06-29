package JavaConcepts_And_Programs.Concepts;

public class exampleInheitance  extends ParentDemo {
    String name ="QAClickAcademy";
    public exampleInheitance()
    {
        super();// this should be always be at first line
        System.out.println("child class construtor");

    }
    public void getStringdata()
    {
        System.out.println(name);
        System.out.println(super.name);
    }


    public void getData()
    {
        super.getData();
        System.out.println("I am in child class");
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub



        exampleInheitance cd = new exampleInheitance();

        cd.getStringdata();
        cd.getData();
    }
}
