import java.util.Scanner;

public class RotationofTwoStrings {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = obj.nextLine();
        System.out.print("Enter second string: ");
        String secondString = obj.nextLine();
        areRotations(firstString,secondString);
    }
    public static boolean areRotations(String str1, String str2){
        boolean State = false;
        if(str1.length() == str2.length()){
            String concaString = str1+str1; // this way we can determine any possible rotation
            int endingIndex = str2.length();
            for (int i = 0; i <= concaString.length() - str2.length(); i++) {
                String matchingCharacters = concaString.substring(i, endingIndex++); //built-in method in Java, provided by the String class.
                if (str2.equals(matchingCharacters)){
                    State = true;
                }}
        }
        System.out.println(State);
        return State;
    }}