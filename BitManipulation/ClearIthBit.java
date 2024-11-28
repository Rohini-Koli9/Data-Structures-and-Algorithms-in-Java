package BitManipulation;

public class ClearIthBit {
    public static int clearIthBit (int n,int i) {
        int bitMask = ~(i<<i);
        return n & bitMask;
    }
    public static void main (String args[]) {
        System.out.println(clearIthBit(10,1));
    }
}