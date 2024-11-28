package Conditional_Statements;

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year  = sc.nextInt();
            
            if((year % 4 == 0) && ((year % 100 !=0) || (year % 100 == 0) && (year % 400 == 0))){
                  System.out.println(year + "Is a Leap Year");
            }else {
                System.out.println(year + " Is not a Leap Year");
            }
        }
    }
}
