import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeated {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(5);
        array.add(1);
        array.add(2);
        ArrayList<Integer> array1 = new ArrayList<>();  //the set must be cloned for comparision and because sets eliminate duplicates
        array1.add(2);
        array1.add(5);
        array1.add(1);
        array1.add(2);
        findFirstRepeated(array, array1);
    }
    public static Integer findFirstRepeated(ArrayList<Integer> arr, ArrayList<Integer> arr1){
        LinkedHashSet<Integer> set = new LinkedHashSet<>(arr); //Linked Hash set is used to track order/index of the elements in the loop
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(arr1);
        Integer firstElem = 0;

        for(Integer a: set){
            Integer count = 0;
            for(Integer b: set1){
                if(a.equals(b)){
                    count++;
                }}
            if(count>0){
                firstElem=a;
                break;
            }
        }
        System.out.println(firstElem);
        return firstElem;
    }
}