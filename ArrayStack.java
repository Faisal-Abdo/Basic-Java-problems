import java.util.ArrayList;
import java.util.Stack;

public class ArrayStack {
    public static void main(String[] args) {

        ArrayList<Integer> random = new ArrayList<>();
        push(random,5);
        push(random,10);
        push(random,9);

        pop(random);
        peek(random);
        checkingEmpty(random);

    }

    public static void push(ArrayList<Integer> array, int n){
        array.add(n);
        System.out.println(array);
    }
    public static void pop(ArrayList<Integer> array){
        int removal = array.get(0);
        array.removeFirst();
        System.out.println(array);
    }
    public static void peek(ArrayList<Integer> array){
        System.out.println(array.get(0));
    }
    public static void checkingEmpty(ArrayList<Integer> array){
        System.out.println(array.isEmpty());
    }

}
