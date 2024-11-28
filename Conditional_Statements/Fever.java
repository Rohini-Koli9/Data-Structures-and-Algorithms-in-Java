package Conditional_Statements;
public class Fever {
    public static void main(String[] args) {
        double temp  =103.5;
        String fever  =  (temp > 100) ? "Yov have fever" : "Your body temperature is normal";
        System.out.println(fever);
    }
}
