import java.util.*;

public class UniqueTriplets {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-1, 0, 1, 2, -1, -4));
        findUniqueTriplets(arrayList);
    }

    public static Set<List<Integer>> findUniqueTriplets(ArrayList<Integer> array) {
        Set<List<Integer>> finalSet = new HashSet<>(); //to display duplicate elements within the same list but not duplicate combinations
        for (Integer i = 0; i < array.size(); i++) {
            for (Integer j = i + 1; j < array.size(); j++) {
                for (Integer k = j + 1; k < array.size(); k++) {
                    Integer triplet = array.get(i) + array.get(k) + array.get(j);
                    if (triplet == 0) {
                        List<Integer> tripletList = (Arrays.asList(array.get(i), array.get(k), array.get(j)));
                        Collections.sort(tripletList); // to avoid duplicate combinations
                        finalSet.add(tripletList);
                    }
                }
            }
        }
        System.out.println(finalSet);
        return finalSet;
    }
}