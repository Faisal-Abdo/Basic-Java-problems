import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        parenthesisCheck("((a+b))");
    }
    public static void parenthesisCheck(String word) {
        char[] stringToArray = word.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        boolean stateDuplicate = false;
        for (Character a : stringToArray) {
            if (a == ')') {
                int count = 0;
                while (characterStack.peek() != '(') {
                    characterStack.pop();
                    count++;
                }
                characterStack.pop();
                if (count == 0) {
                    stateDuplicate = true;
                    break;
                }
            } else {
                characterStack.push(a);
            }
        }
        if (stateDuplicate) {
            System.out.println("Duplicate parentheses found.");
        } else {
            System.out.println("No duplicate parentheses.");
        }
    }}