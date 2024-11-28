package Strings;
import java.util.*;
//java.lang.Object;


public class CompressStringbuilder {

    public static StringBuilder compressStringBuiler(StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            Integer count =1;

            while(i<sb.length()-1 && sb.charAt(i) == sb.charAt(i+1)){
                count ++;
                sb.append(count);
                i++;
            }
            sb = (StringBuilder) sb.charAt(i);
            if(count > 1){
                sb += count.toString(sb);
            }

        }
        return sb;
        
    }
    public static void main(String[] args) {
        
    StringBuilder sb = new StringBuilder("aabbbcccc");
    System.out.println(compressStringBuiler(sb));
        
    }


    
}
