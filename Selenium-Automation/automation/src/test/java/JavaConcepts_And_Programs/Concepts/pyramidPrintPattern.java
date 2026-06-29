package JavaConcepts_And_Programs.Concepts;

public class pyramidPrintPattern {
 public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("==================");
        int p=3;
        for(int m=1;m<=3;m++){
            for(int n=1;n<=m;n++){
                System.out.print(p);
                System.out.print(" ");

                p=p+3;
            }            System.out.println();
        }
    }
}
