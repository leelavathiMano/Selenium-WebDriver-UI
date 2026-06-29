package JavaConcepts_And_Programs.Concepts;

public class findMaxNumincolumn {
    
public static void main(String[] args){
    int mincolumn=0;
    // find the minimum number in the row and find the max number in the same column
    // 2 4 5
    // 6 8 9
    // 1 7 0
int  b[][] = {{2, 4, 5}, {6, 8, 9}, {1, 7, 0}};
    int min=b[0][0];
    for(int i=0;i<b.length;i++){
        for(int j=0;j<b.length;j++){
            if(b[i][j]<min){
                min=b[i][j];
                mincolumn=j;


            }

        }
    }System.out.println("min column is "+mincolumn);
    int max=b[0][mincolumn];
    int k=0;
    for( k=0;k<3;k++){
        //num of rows
        if(b[k][mincolumn]>max){
            max=b[k][mincolumn];
        }
    }

  //  while(k<3){
        //if(b[k][mincolumn]>max){
           // max=b[k][mincolumn];
       // }
        k++;
   // }
    System.out.println("max num is "+max);
    System.out.println("min num is "+min);
    //find colum index of the minimum num


//find the max num of the minimum num row or column
    //if(min<)
}


}
