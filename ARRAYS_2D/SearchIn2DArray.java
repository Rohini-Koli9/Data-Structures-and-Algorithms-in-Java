package ARRAYS_2D;

import java.util.*;

public class SearchIn2DArray {

    public static boolean searchIn2DArray(int matrix[][] , int key){
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" + i + ","+ j +")");
                    return true;
                }
            }
        }
        System.out.println("key not found.");
        return false;
    }

    //homework-->print largest and smallest element in matrix
    public static int largestElement(int matrix[][]){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1; j++){
                if (max > matrix[i][j+1]){
                    max = matrix[i][j];
                }
                System.out.println(max);
                return max;

            }
        }
        return max;
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        Scanner sc =new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
             matrix[i][j] = sc.nextInt();    
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
             System.out.print(matrix[i][j] + " ");   
            }
            System.out.println();
        }
        //searchIn2DArray(matrix, 4);
        largestElement(matrix);
    }
}
