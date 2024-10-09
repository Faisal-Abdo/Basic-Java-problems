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
            if (a == ')') {  //when ) is reached enter loop
                int count = 0;
                while (characterStack.peek() != '(') {  //check in between (...) for any elements
                    characterStack.pop();
                    count++;
                }
                characterStack.pop();  //delete the '('
                if (count == 0) {   //if none elements then it is duplicate
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