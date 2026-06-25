package JavaConcepts_And_Programs;

public class Arrays {
    public static void main(String[] args) {
            // Array is a class we can insert same set of values which should be the same data types only
        //we can store many values in one variables . the size of the array is fixed and cannot be extended once declared
        //it will follow the index value starts from 0
        //when the size of the array is more than the declared siz it will throw the out of bound exception
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int[] arr1 = {1, 2, 3, 4, 5,334,343,232,443,1,34};
        float[] f= new float[6];
        f[0] = 1.2f;
        f[1] = 23.3f;
        f[2] = 3.67f;
        f[3] = 98.2f;
        f[4] = 52.6f;
        f[5]=78.3f;
        System.out.println(f[0]);
        System.out.println(f[5]);
        System.out.println(arr[3]);
        //to know the size of the array
        System.out.println(arr.length);
        for(int i = 0; i< arr1.length; i++) {
System.out.println(arr1[i]);
System.out.println(arr1[8]);
        }
String[] name={"Leela","Preksha","senthil","Naren","maheswari"};
        for(int j=0;j<name.length;j++){
            System.out.println(name[j]);
        }
        System.out.println(name[2]);
        for(String s: name){
            System.out.println(s);
    }
    //Enhanced for loop= to pick each elememts from the string we should declare one varible with the respective data type as below
        double[] numbers={2.3,4.44,23.2,43.5,56.2,43.2,12.0,9.08};
        for( int k=numbers.length-1;k>=0;k--){ //8
            System.out.println(numbers[k]);
        }
        System.out.println(numbers.length-1);

}

}
