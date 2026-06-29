package JavaConcepts_And_Programs.Concepts;

public class functionOverloadingConcept {
      //function overloading is the methods are with same name but will be differentiated with
    // type of argument, number(count) of arguments and sequence of argument

    //real time example is in E-commerce website there is a getPaymentMethod() but it will differ with getpayment by debit card, and netbanking, UPI,
    //credit card
    public void getPayment(String debit_card){
        System.out.println("Paid via debit card successfully");
    }
    public void getPayment(String credit_card, int amount){
        System.out.println("Paid via credit card with rupees of 1000 successfully");

    }
    public void getPayment(int amount, int product_id){
        System.out.println("150 is the amount of #121 product");
    }
    public static void main(String args[]){
        functionOverloadingConcept f1=new functionOverloadingConcept();
        f1.getPayment("VISA Mastercard");
        f1.getPayment("RUPAY",1000);
        f1.getPayment(350,121);
    }

}
