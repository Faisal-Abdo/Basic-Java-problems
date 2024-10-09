import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>();
        numberArray.add(5);
        numberArray.add(3);
        numberArray.add(3);
        numberArray.add(2);
        ArrayList<Integer> numberArray1 = new ArrayList<>();
        numberArray1.add(1);
        numberArray1.add(3);
        numberArray1.add(5);
        findIntersection(numberArray,numberArray1);
    }
    public static Set<Integer> findIntersection(ArrayList<Integer> array, ArrayList<Integer> array1){
        Set<Integer> intersection = new HashSet<>(array);
        Set<Integer> intersection1 = new HashSet<>(array1);
        intersection.retainAll(intersection1);

        System.out.println(intersection);
        return intersection;
    }
}
