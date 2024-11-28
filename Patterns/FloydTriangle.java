public class FloydTriangle {
    public static void main(String[] args) {
        int num=1;
        for(int i=1; i<=5; i++){
            for(int nums=1; nums<=i; nums++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
