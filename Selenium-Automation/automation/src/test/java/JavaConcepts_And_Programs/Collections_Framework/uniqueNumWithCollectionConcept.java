package JavaConcepts_And_Programs.Collections_Framework;

import java.util.ArrayList;

public class uniqueNumWithCollectionConcept {
   public static void main(String args[]){

        int a[]={4,5,4,6,5,4,5,6,4,9};
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<=a.length-1;i++){
            int k=0;
            if(!al.contains(a[i])){
               al.add(a[i]);
               k++;
               for(int j=i+1;j<=a.length-1;j++){
                   if(a[i]==a[j]){
                       k++;
                   }
               }
                System.out.println(a[i]);
                System.out.println(k);
                if(k==1){
                    System.out.println("unique number of array is " + a[i]);
                }
            }

        }
//store the value in arraylist

    }
}
