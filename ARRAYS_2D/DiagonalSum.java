package ARRAYS_2D;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){

        int sum =0;

        // for(int i=0; i<matrix.length;i++){ //Time Complexity O(n^2)
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j){//primary diagonal
        //             sum += matrix[i][j];
        //         }
        //        else if(i+j == matrix.length-1){//secondary diagonal
        //         sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){ //Time Complexity--O(n)
            //primary diagonal
            sum+=matrix[i][i];

            //secondary diagonal
            if(i !=matrix.length-1-i) //overlapping element condition 
              sum += matrix[i][matrix.length-1-i];  //i+j=n-1

        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
}
