import java.util.Stack;

public class StackPalindrome {
    public static void main(String[] args) {
        palindromeChecker("ababa");
    }
    public static boolean palindromeChecker(String word){
        boolean flag = false;
        Stack<String> reverse = new Stack<>();
        char[] stringTOChar = word.toCharArray();
        String empty = "";
        String empty1 = "";
        for(char a: stringTOChar){
            empty+=reverse.push(Character.toString(a));
        }
        for (char b: stringTOChar){
            empty1+=reverse.pop();
        }
        if(empty1.equals(empty)){
            flag = true;
        }
        System.out.println(flag);
        return flag;
    }
}
