import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a string: ");
        String input1 = obj.nextLine();
        System.out.print("enter a character you want to remove: ");
        char inputChar = obj.next().charAt(0);
        removeCharacter(input1,inputChar);
    }
    public static removeCharacter(String str, char ch){
        char[] stringtoArray = str.toCharArray();
        StringBuilder newString = new StringBuilder(); //Class used for creating and manipulating mutable strings
        for(char x: stringtoArray){
            if(x!=ch){
                newString.append(x);
            }}
        System.out.println(newString);
        return newString;
    }}
