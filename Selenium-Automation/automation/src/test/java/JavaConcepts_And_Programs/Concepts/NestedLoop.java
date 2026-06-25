package JavaConcepts_And_Programs;

public class NestedLoop {
     public static void main(String args[]){
        int j,k=1;
        int p=1;
        for(int i=0;i<=4;i++){

            for(j=1;j<=4-i;j++) {
                System.out.print(k);
                System.out.print(" ");
                k++;

                }
            System.out.println();

            }
        System.out.println("======================================");
for(int m=1;m<=4;m++){
   // for(int n=4;n>4-m;n--) {
        for(int n=1;n<=m;n++){
        System.out.print(p);
        System.out.print(" ");
        p++;
    }
    System.out.println();
    //System.out.print("\t");


}


}

}
