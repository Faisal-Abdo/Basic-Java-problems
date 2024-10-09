import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionSet {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Set.of(2,4,3));
        Set<Integer> setB = new HashSet<>(Set.of(5,7,3,1));
        findUnion(setA,setB);
    }
    public static Set<Integer> findUnion(Set<Integer> set, Set<Integer> set1){
        set.addAll(set1);
        System.out.println(set);
        return set;
    }
}
