import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DisjountArrays {
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
        determineDisjoint(arr,arr1);
    }
    public static void determineDisjoint(ArrayList<Integer> array, ArrayList<Integer> array1){
        Set<Integer> intersection = new HashSet<>(array);
        Set<Integer> intersection1 = new HashSet<>(array1);
        intersection.retainAll(intersection1);
        if(!intersection.isEmpty()){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}
