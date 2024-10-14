import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Set;

public class NearbyDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3));
        Integer n = 3;
        findNearbyDuplicate(array,n);
    }
    public static boolean findNearbyDuplicate(ArrayList<Integer> array, Integer k ){
        Set<Integer> setOfDuplicates = new HashSet<>();
        boolean state = false;
            for(int i=0; i<array.size()-k;i++){
                for (int j=i+1;j<=k+1;j++){
                    if(array.get(i)==array.get(j)){
                        if(Math.abs(i-j)==k){
                            setOfDuplicates.add(array.get(i));
                            setOfDuplicates.add(array.get(j));
                            state = true;
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
            }
        System.out.println(setOfDuplicates);
        System.out.println(state);
        return state;
    }
}
