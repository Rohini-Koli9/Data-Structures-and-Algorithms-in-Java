package Loops;

////// rev = (rev*10) + lastDigit  ///////
public class Reverse_Given_Number {
    public static void main(String[] args) {
        int n = 234518;
        int rev = 0;
        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
            
        }
        System.out.print(rev);
        

    }
}
