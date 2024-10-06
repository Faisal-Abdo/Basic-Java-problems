import java.util.Stack;

public class ArrayStack {
    public static void main(String[] args) {
        Stack<Integer> random = new Stack<>();
        random.push(5);
        random.push(10);
        random.push(3);

        Integer pop = random.pop();
        System.out.println(pop);

        Integer peeking = random.peek();
        System.out.println(peeking);

        boolean empty= random.isEmpty();
        System.out.println(empty);

    }
}
