package Loops;
import java.util.*;
public class Prime{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            if(n ==2 ){
                System.out.println(n + "is Prime");
            }else{
                boolean isPrime =  true;
                for (int i = 2; i <= n-1; i++){
                     if(n % i ==0){ // n is multiple pf i (i is not equal to 1 or n)
                        isPrime= false;
                    }
                 }
   
                 if(isPrime == true){
                    System.out.println(n + " is Prime");
                 }else{
                    System.out.println(n + " is not Prime");
                 }
                     
                }
        }
    
    

        }

       
    }
