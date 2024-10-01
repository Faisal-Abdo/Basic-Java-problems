import java.util.Scanner;

public class LongestMirror {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = obj.nextLine();
        findingMirrors(userInput);
    }
    public static void findingMirrors(String input){
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse(); //reverse
        String reversedInput = reversed.toString(); //converted to string again
        String mirror = ""; //for comparision
        for(int i=0;i<input.length();i++){
            if(reversedInput.charAt(i)==input.charAt(i)){
                mirror+=input.charAt(i);
            }
            else{
                break;
            }}
        System.out.println(mirror);
    }}