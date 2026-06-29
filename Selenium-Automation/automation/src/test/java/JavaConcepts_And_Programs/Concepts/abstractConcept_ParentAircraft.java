package JavaConcepts_And_Programs.Concepts;

public abstract class abstractConcept_ParentAircraft {
    //Abstraction is the process of hiding internal details and providing only neccessary details tp the user
    // abstract class can contains concrete(defined bodies) and non-concrete methods(undefined / only declared methods)- partial abstraction
    // if any method which has no implementation that method we can call it as "abstract methods"
    // for that we need to use the keyword called "abstract"
    // In a class if any one method is a abstract method that class will be called as abstract class
// interface is a 100% of abstraction(it has only declared method no body in it)
    // we cannot create the instance or object for the abstract class
    // all the abstract methods and variables are public in nature
    // we cannot create private methods or variables because we need to implements those abstract methods in sub class
    public static int i=3;
    public void followEngineRules(){
        System.out.println("follow engine rules");
    }
    public void followSafetyRules(){
        System.out.println("follow safety rules");

    }
 abstract void logo();
    public abstract void bodyColor();


}
