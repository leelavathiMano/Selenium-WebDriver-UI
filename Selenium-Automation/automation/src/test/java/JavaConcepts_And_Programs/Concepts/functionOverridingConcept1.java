package JavaConcepts_And_Programs.Concepts;

public class functionOverridingConcept1 {
      // the method from the parents class will be over ridden by the child class is called function oveririding
    // In function overriding the method name will be same , argument type will be same and sequence also will be same
    public void gear(){
        System.out.println("4 gear model");
    }
    public int engine(){
        int cc=110;
        System.out.println(cc);
        return cc;
    }
    public void audioSystem(){
        System.out.println("Parent Audio System");
    }   

}
