package Conditional_Statements;

import java.util.*;
public class Check {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int number = sc.nextInt();
            if(number > 0){
                System.out.println("Number Is Positive!");
            }else{
                System.out.println("Number Is Negative!");
            }
        }
    }
}

