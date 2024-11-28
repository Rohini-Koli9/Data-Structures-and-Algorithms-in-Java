//import java.util.*;
public class PairsInArray {

    public static void printPairs(int arr[]){
        int totalPairs =0;
        for(int i =0; i < arr.length; i++){
            int curr = arr[i]; // 2, 5, 6, 7, 8,10
            for(int j =i+1; j < arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] +")" );
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + totalPairs);  // formula = (n*(n-1))/2
    }
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 7, 8, 10};
        printPairs(arr);
    }
}
