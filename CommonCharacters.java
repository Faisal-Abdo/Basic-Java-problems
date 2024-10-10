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
        ArrayList<Character> stringArray = new ArrayList<>();
        ArrayList<Character> stringArray1 = new ArrayList<>();
        for(int i=0;i<StringToChar.length;i++){
            stringArray.add(StringToChar[i]);
            stringArray1.add(StringToChar1[i]);
        }


        Set<Character> set = new HashSet<>(stringArray);
        Set<Character> set1 = new HashSet<>(stringArray1);
        set.retainAll(set1);
        System.out.println(set);
    }
}
