import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;

public class PairGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 5, 7, -1, 5));
        Integer targ = 6;
        findAllPairs(arrayList,targ);
    }
    public static void findAllPairs(ArrayList<Integer> array, Integer target){
        Set<Integer> storingSet = new HashSet<>();
        LinkedHashSet<Integer> validPairs = new LinkedHashSet<>();
        Integer result;
        for (Integer i=0;i<array.size();i++){
            result = target-array.get(i);
            if(storingSet.contains(result)){
                validPairs.add(array.get(i));
                validPairs.add(result);
            }
            else {
                storingSet.add(array.get(i));
            }}
        Integer store = 0;
        Integer store1 =0;
        Integer count=0;
        for(Integer n: validPairs){
            System.out.println();
            count++;
            if(count%2==0){
                store1 = n;
            }
            else {
                store = n;
            }
            if(count%2==0){ //this way it prints intended pairs only :)
                System.out.println("( "+store+" , "+store1+" )");
            }}
    }
}