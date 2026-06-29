package JavaConcepts_And_Programs.Concepts;

public class exceptionHandling {
 // In a website when popup displays ocassionally ,to handle this we can use this try-catch block
    // one try block , can have the multiple catch blocks
    // always the catch block should be followed after try block
    //finally block will be exceuted all the time irrespective of the error thrown or not
    //without catch we cannot write finally block
    int a=2,b=0;
    int k;
    public void getData(){
        //try-catch mechanism
        try{
           // k=a/b;
            int arr[]=new int[5];
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException ao){
            System.out.println("Catched the ArrayIndexOutOfBounds exception");

        }
        catch(ArithmeticException a){

            System.out.println("Catched the Arithmatic exception");

        }
        catch (Exception e){
            System.out.println("Catched the exception");
        }
finally {
            System.out.println("Delete caches and cookies");
        }
    }
    public static void main(String args[]){
        exceptionHandling e1=new exceptionHandling();
        e1.getData();

    }
}
