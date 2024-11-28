package BitManipulation;

public class OddOrEven {
    public static void  oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
    public static void main(String args[]) {
        oddOrEven(5);
        oddOrEven(10);
    }
}
