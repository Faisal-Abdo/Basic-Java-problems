import java.util.Stack;

public class StackEmpty {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        //num.push(5);
        isEmpty(num);
    }
    public static boolean isEmpty(Stack<Integer> stack){
        Integer countOccurence = 0;
        boolean flag = false;
        for(int i=0;i<stack.size();i++){
            countOccurence++;
        }
        if(countOccurence<1){
            flag = true;
        }
        System.out.println(flag);
        return flag;
    }}