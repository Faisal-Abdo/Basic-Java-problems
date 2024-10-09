import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionSet {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(3);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(7);
        arr1.add(3);
        arr1.add(1);
        findUnion(arr,arr1);
    }
    public static Set<Integer> findUnion(ArrayList<Integer> array, ArrayList<Integer> array1){
        Set<Integer> setA = new HashSet<>(array);
        Set<Integer> setB = new HashSet<>(array1);
        setA.addAll(setB);
        System.out.println(setA);
        return setA;
    }
}