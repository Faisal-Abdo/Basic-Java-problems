import java.util.Arrays;
import java.util.TreeSet;
import java.util.ArrayList;

public class ContiguousIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 2, 3, 6, 4, 4, 7));
        findContiguous(array);
    }
    public static void findContiguous(ArrayList<Integer> arr){
        TreeSet<Integer> sortedSet = new TreeSet<>(arr);
        boolean state = true;
        Integer min = sortedSet.last();  //basic ways to find min and max
        for (Integer n: sortedSet){
            if(n<min){
                min = n;
            }}
        Integer max=0;
        for (Integer j: sortedSet){
            if(j>max){
                max=j;
            }}
        Integer missingNum = min-1; //look at the comment below to get why I subtracted 1
        for(Integer k: sortedSet){
            missingNum++;  //here it starts comparing from min
            if(!sortedSet.contains(missingNum)){
                state=false;
                break;
            }
            else {
                continue;
            }}
        if(state){
            System.out.println(state+ " contains contiguous integers from "+min+" to "+max);
        }
        else {
            System.out.println(state+" There are gaps in the set son");
        }}
}