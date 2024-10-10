import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {
    public static void main(String[] args) {
        findCommon("Hello","World");
    }
    public static void findCommon(String word, String word1){
        char[] StringToChar = word.toCharArray();
        char[] StringToChar1 = word1.toCharArray();
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        for(int i=0;i<StringToChar.length;i++){
            set.add(StringToChar[i]);
            set1.add(StringToChar1[i]);
        }
        set.retainAll(set1);
        System.out.println(set);
    }
}