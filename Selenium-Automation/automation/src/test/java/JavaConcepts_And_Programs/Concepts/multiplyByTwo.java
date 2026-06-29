package JavaConcepts_And_Programs.Concepts;

public class multiplyByTwo {
  public static void main(String args[]){
        int[] arr1 = {1, 2, 3, 4, 5,334,343,232,443,1,34};
        for(int i=0;i<arr1.length;i++){
           if(arr1[i]%2==0){
               System.out.println(arr1[i]);
               //break is the keyword which will exit from the condition once it is satisfied with first value or first condition got pass
               //break;
           }
           else{
               System.out.println(arr1[i]+" values are present which is not multiply by 2");

           }
        }


    }
}
