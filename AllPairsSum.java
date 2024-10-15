import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class AllPairsSum {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 2, 3));
        Integer window=4;
        findAllPairsSum(array,window);
    }
    public static List<Integer> findAllPairsSum(ArrayList<Integer> arr, Integer k){
        List<Integer> subList;
        Set<Integer> set ;
        List<Integer> listOfCounts  = new ArrayList<>();
        for(int i=0;i<=arr.size()-k;i++){
            subList = arr.subList(i,i+k); //function same as substring idea
            set = new HashSet<>(subList); // to create each time a new set
            listOfCounts.add(set.size());
        }
        System.out.println(listOfCounts);
        return listOfCounts;
    }
}
