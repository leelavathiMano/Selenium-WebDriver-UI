package JavaConcepts_And_Programs;

public class findMinimumNumfromMatrix {
 public static void main(String args[]) {
        int xy[][] = new int[3][3];
        xy[0][0] = 11;
        xy[0][1] = 3;
        xy[0][2] = 14;
        xy[1][0] = 18;
        xy[1][1] = 10;
        xy[1][2] = 3;
        xy[2][0] = 6;
        xy[2][1] = 9;
        xy[2][2] = 45;
        int minimum = xy[0][0];
        int maximum = xy[0][0];

        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy.length; j++) {
                if (xy[i][j] < minimum) {
                    minimum = xy[i][j];
                }
            }
        }
        System.out.println(minimum);
        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy.length; j++) {
                if (maximum < xy[i][j]) {
                    maximum = xy[i][j];
                }
            }

        }
        System.out.println(maximum);

    }
}
