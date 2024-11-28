package Strings;

public class PrintLetters {
    public static void printLetters(String str){

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Rohini";
        String lastName = "Koli";
        String fullName = firstName +" " + lastName; //concatenation
        //System.out.println(fullName.charAt(0));
        printLetters(fullName);
        }
    
    
}
