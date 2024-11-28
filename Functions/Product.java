package Functions;

public class Product {

    public static int multiply(int a, int b){
       int product = a * b;
       return product;

    }
    public static void main(String[] args) {
        int a =2;
        int b = 3;
       int prod = multiply(a, b); //copy will pass to the function
        System.out.println(prod);
    }
}
