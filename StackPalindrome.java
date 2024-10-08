import java.util.Stack;

public class StackPalindrome {
    public static void main(String[] args) {
        palindromeChecker("racecar");
    }
    public static boolean palindromeChecker(String word){
        boolean flag = false;
        Stack<String> reverse = new Stack<>();
        char[] stringTOChar = word.toCharArray();
        StringBuilder originWord = new StringBuilder();
        StringBuilder reverseWord = new StringBuilder();
        for(char a: stringTOChar){
            originWord.append(reverse.push(Character.toString(a)));
        }
        for (char b: stringTOChar){
            reverseWord.append(reverse.pop());
        }
        if(reverseWord.toString().equals(originWord.toString())){
            flag = true;
        }
        System.out.println(flag);
        return flag;
    }
}
