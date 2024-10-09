import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueSet {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>();
        numberArray.add(5);
        numberArray.add(3);
        numberArray.add(5);
        numberArray.add(3);
        printUnique(numberArray);
    }
    public static void printUnique(ArrayList<Integer> array){
        Set<Integer> uniqueSet = new HashSet<>(array);
        System.out.println(uniqueSet);
    }
}
