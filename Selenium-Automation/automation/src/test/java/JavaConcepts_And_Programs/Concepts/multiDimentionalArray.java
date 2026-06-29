package JavaConcepts_And_Programs.Concepts;

public class multiDimentionalArray {
       // Assisgning the values on the basis of x axis and y axis called multidimentional array like matrix
    //X axis for rows, Y axis for column
    public static void main(String args[]) {
        int xy[][] = new int[3][3];
        xy[0][0] = 1;
        xy[0][1] = 3;
        xy[0][2] = 14;
        xy[1][0] = 18;
        xy[1][1] = 10;
        xy[1][2] = 3;
        xy[2][0] = 6;
        xy[2][1] = 9;
        xy[2][2] = 45;
        int b[][] = {{2, 4, 5}, {6, 8, 9}, {1, 7, 0}};
        System.out.println(b[1][2]);

        System.out.println(xy[2][1]);

        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy.length; j++) {
                    System.out.print(xy[i][j]);

                    System.out.print(" ");
                }
                System.out.println();
            }
        }

}
