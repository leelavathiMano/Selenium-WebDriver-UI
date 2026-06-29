package JavaConcepts_And_Programs.Concepts;

public class childaAbstraction_childAirlines extends abstractConcept_ParentAircraft{
    public static void main(String args[]){
        childaAbstraction_childAirlines c=new childaAbstraction_childAirlines();
        c.followEngineRules();
        c.followSafetyRules();
        c.bodyColor();
        c.logo();
        System.out.println(i);
        // we cannot create the object or instance for the abstract classes
        // abstractConcept_ParentAircraft p=new abstractConcept_ParentAircraft();
    }

    @Override
    void logo() {
System.out.println("emblem");
    }

    @Override
    public void bodyColor() {
        System.out.println("Red color");
    }



}
