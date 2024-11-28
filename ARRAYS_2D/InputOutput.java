package ARRAYS_2D;
import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int matrix [][] =new int[3][3];

            //taking input
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                 matrix[i][j] = sc.nextInt();    
                }
            }

            //printing
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                 System.out.print(matrix[i][j] + " ");   
                }
                System.out.println();
            }
        }
        
    }
}
