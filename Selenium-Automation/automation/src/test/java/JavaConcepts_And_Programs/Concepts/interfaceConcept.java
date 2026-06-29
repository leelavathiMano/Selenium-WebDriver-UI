package JavaConcepts_And_Programs.Concepts;

public interface interfaceConcept {
   //interface is almost similar to the class but small diff is class contains body, interface has no body
    // interface has the number of the methods in the class but no body
    // but declared method should be implemented in sub/child class
    // we use "implements" keyword in interface
    //eg: Green/Red/yellow methods or declared in interface as a central Govt
    // the each country should implements the above class respective to the country :Australia
    // All the methods in the interface should be implemented in subclass without fail
    // all the variable which are declared must be in interface are public in nature
    // if other class has their own method we cannot call by Interface Object
    // to access  we should create specific class object and should call the inner class mehods
    //One class can implement more than one interfaces
    //variables must be declared as public,final,static

    public void greenLight();
    public void redlight();
    public void yellowlight();
}
