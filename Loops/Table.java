package Loops;
import java.util.*;
public class Table {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Table Number: ");
            int n = sc.nextInt();
            for(int i=1; i<=10; i++){
               int table = n*i;
                System.out.println(table);
            }
        }
    }
    
}
