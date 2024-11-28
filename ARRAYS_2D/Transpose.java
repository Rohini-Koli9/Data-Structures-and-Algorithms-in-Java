package ARRAYS_2D;

public class Transpose {

    public static void transposeMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i== j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        System.out.println(matrix);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6}};
        transposeMatrix(matrix);
    }
}
