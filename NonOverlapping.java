import java.util.*;

public class NonOverlapping {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Integer count = 0;
        Set<List<Integer>> Interval = new HashSet<>();
        while (true){
            System.out.print("Enter first pair of Integers(enter a pair of 0 to exit): ");
            Integer input = obj.nextInt();
            count++;
            System.out.print("Enter second pair of Integers(enter a pair of 0 to exit): ");
            Integer input1 = obj.nextInt();
            count++;
            if(input==0 || input1==0){
                break;
            }
            if(count%2==0){
                List<Integer> storeList = (Arrays.asList(input, input1));
                Collections.sort(storeList);
                Interval.add(storeList);
            }
        }
        findNonOverlapping(Interval);
        System.out.println(Interval+ "first sort");
    }

    public static Integer findNonOverlapping(Set<List<Integer>> intervalSet){
        List<Integer> comparisionList = new ArrayList<>();
        for(List<Integer> n: intervalSet){
            for(Integer a: n){
                comparisionList.add(a);
            }
        }
        System.out.println(comparisionList);
        Integer countIntervals=0;
        Integer nextNum = 0;
        List<Integer> subList;
        for(Integer k=0;k<comparisionList.size()-1;k++){
            subList = comparisionList.subList(k,k+2);
            k++;      // for it to slide a window of 2 each time ;)
            for(Integer q: subList){
                nextNum=q+1;  // Check non-overlapping and contiguous
                if(subList.contains(nextNum)){
                    countIntervals++;
                }
            }
        }
        System.out.println(countIntervals);
        return countIntervals;
    }
}