package Functions;

public class SumofDigit {


    public static int sumDigit(int n){
        int sum =0;
        while( n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n /= 10;
        }
       return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigit(123));
        
    }
    
}
