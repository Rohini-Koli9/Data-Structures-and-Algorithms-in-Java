public class Advanced_Patterns {

    public static void hollow_rectangle(int totRows,int totCols){

        for(int i=1; i<=totRows; i++){

            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totRows || j==1 || j==totCols ){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n ){
        for(int i=1; i<=n; i++){

            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    public static void inverted_half_pyramid_withNumbers(int n){
        for (int i=1; i <=n; i++) {
            //inner -numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }

    public static void floyds_triangle(int n){
        int counter=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOne_Triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        //hollow_rectangle(10, 7);
       // inverted_rotated_half_pyramid(4);
       //inverted_half_pyramid_withNumbers(5);
       //floyds_triangle(5);
       zeroOne_Triangle(5);
    }
}

