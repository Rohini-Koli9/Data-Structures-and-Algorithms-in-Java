import java.util.*;
public class Average{
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        float average = (num1+num2+num3)/3;
        System.out.println(average);
      }
    }     
}