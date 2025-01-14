package Stack;

import java.util.*;

public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top =s.pop();//remove krenge upar jaate huye
        pushAtBottom(s, data);

        s.push(top);//add krte jayenge niche aate huye
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        //verify
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
