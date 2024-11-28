package Functions;
import java.util.*;
public class Palindrome {

    public static boolean isPalindrome(int n){
        int palindrome = n;
        int rev = 0;
        while( palindrome !=  0){
            int rem = palindrome % 10;
            rev = (rev * 10) + rem;
            palindrome = palindrome/10;
        }
        return false;
    
    }
    public static void main(String[] args) {
        System.out.println("Enter Number");
        try (Scanner sc = new Scanner(System.in)) {
            int palindrome = sc.nextInt();
      
            if( isPalindrome(palindrome)){
                System.out.println("true");
            }else{
               System.out.println("false");
            }
        }
    }
    
}
