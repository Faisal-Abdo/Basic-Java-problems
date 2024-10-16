import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "ababa";
        findPalindrome(str);
    }
    public static boolean findPalindrome(String word){
        boolean state = true;
        word.replaceAll(" ","");
        char[] charArray = word.toCharArray();
        Set<Character> oddChecker = new HashSet<>();
        for(char a: charArray){
            if (oddChecker.contains(a)) {
                oddChecker.remove(a);
            } else {
                oddChecker.add(a);
            }
        }
        if(oddChecker.size()>1){
            state = false;
        }
        System.out.println(state);
        return state;
    }
}