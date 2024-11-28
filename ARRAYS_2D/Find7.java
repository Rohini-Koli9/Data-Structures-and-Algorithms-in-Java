package ARRAYS_2D;

public class Find7 {
    public static int find7s(int [][] matrix){
        int count = 0;
        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1; j++){
                if(matrix[i][j] == 7 ){
                    count++;  
                } 
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [][] matrix = {{4,7,8},
                           {8,8,7},
                           {7,7,7}};
        System.out.println(find7s(matrix));
    }
}
