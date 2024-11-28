package Conditional_Statements;
import java.util.*;
public class Week {
    /**
 * @param args
 */
public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int number = sc.nextInt();
               switch(number){
                case 1: System.out.println("Monday");
                        break;
                case 2: System.out.println("Monday");
                        break;
                case 3: System.out.println("Tuesday");
                        break;
                case 4: System.out.println("Wednesday");
                        break;
                case 5: System.out.println("Thursday");
                        break;
                case 6: System.out.println("Friday");
                        break;
                case 7: System.out.println("Saturday");
                        break;
                default: System.out.println("Your number is not between 1-7");     
        
               }
}

        
    }
    
}
