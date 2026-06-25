package JavaConcepts_And_Programs;

public class DuplicateInArray {
    public static void main(String args[]){
    int[] arr={2,5,7,9,2,4,8,7,9,12,4};
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if (arr[i]==arr[j]){
                System.out.println("The Duplicate numbers are"+ arr[i]);
            }
        }
    }
}

}
