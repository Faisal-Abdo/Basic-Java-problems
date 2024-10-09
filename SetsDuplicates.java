import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetsDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(2);
        array.add(1);
        checkDuplicate(array);
    }
    public static boolean checkDuplicate(ArrayList<Integer> array1){
        Set<Integer> set = new HashSet<>();
        Integer count = 0;
        for (Integer n: array1){
            set.add(n);
        }
        if(set.size()<array1.size()){   //used my brain
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }}