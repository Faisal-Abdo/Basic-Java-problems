import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MissingRange {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3,0,1)); //in the case that there is one missing number
        findMissingNum(array);
    }
    public static Integer findMissingNum(ArrayList<Integer> arr){
        TreeSet<Integer> treeSet = new TreeSet<>(arr);
        Integer missingNum = 0;
        for(Integer a: treeSet){
            missingNum = a+1;  //the ultimate logic
            if(!treeSet.contains(missingNum)){
                break;
            }
        }
        System.out.println(missingNum);
        return missingNum;
    }
}