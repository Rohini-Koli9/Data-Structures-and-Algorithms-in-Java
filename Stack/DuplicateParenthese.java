package Stack;
import java.util.*;
public class DuplicateParenthese {

    public static boolean isDuplicate(String str) {
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                } else {
                    s.pop(); //opening pair
                }
            } else{
                //opening
                s.push((int) ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
       String str = "((a+b))";
       System.out.println(isDuplicate(str)); 
    }
}
