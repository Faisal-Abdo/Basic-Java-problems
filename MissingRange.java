import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MissingRange {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,3,5,7)); //in the case that there is one missing number
        Integer low = 1;
        Integer high = 10;
        findMissingNum(array, low, high);
    }
    public static TreeSet<Integer> findMissingNum(ArrayList<Integer> arr, Integer min, Integer max){
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int m=0; m<=max-1;m++){
            newArray.add(null); //we set initial size to max(to make the list dynamic)
        }
        for(int k=0; k< arr.size();k++){
            newArray.set(k,arr.get(k));  //we add the given/existing elements
        }
        TreeSet<Integer> missingNumSet = new TreeSet<>();
        Integer missingNum = 0;
        for(int i=min; i>=min && i<=max;i++){
            missingNum = i;  //the ultimate logic
            if(!newArray.contains(missingNum)){  //this way we could go through all the indices in the range
                missingNumSet.add(missingNum);
            }}
        System.out.println(missingNumSet);
        return missingNumSet;
    }}
