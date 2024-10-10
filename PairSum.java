import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(9);
        arr.add(5);
        arr.add(7);
        Integer targ = 16;
        findPairSum(arr,targ);
    }
    public static boolean findPairSum(ArrayList<Integer> array, Integer target){
        Set<Integer> set = new HashSet<>(array);
        Iterator<Integer> iterate = set.iterator();
        boolean state = false;
        while(iterate.hasNext()){
            Integer firstNum = iterate.next();
            Iterator<Integer> iterate1 = set.iterator();  //Hey look I'm learning
            while (iterate1.hasNext()){
                Integer secNum = iterate1.next();
                if(firstNum+secNum==target){
                    state = true;
                }
            }
        }
        System.out.println(state);
        return state;
    }}