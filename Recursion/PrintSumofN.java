package Recursion;
public class PrintSumofN {
    public static int printSumofN(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = printSumofN(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printSumofN(n));
    }
    
}