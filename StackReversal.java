import java.util.Arrays;
import java.util.Stack;

public class StackReversal {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        reverseString("Hello");
    }
    public static void reverseString(String word){

        Stack<String> reverse = new Stack<>();
        char[] stringTOChar = word.toCharArray();
        String empty = "";
        for(char a: stringTOChar){
            reverse.push(Character.toString(a));
        }
        for (char b: stringTOChar){
            empty+=reverse.pop();
        }

        System.out.println(empty);

    }
}
