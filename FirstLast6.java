import java.util.Scanner;
import java.util.ArrayList;

public class FirstLast6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(); // dynamic array
        System.out.print("Enter integers to add to the array (type 'exit' to stop): ");
        while(true){
            String input = obj.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            int number = Integer.parseInt(input); // Convert input to integer
            numbers.add(number);
           }
        boolean Flag = false;
        if(numbers.size()>0){
            if(numbers.getFirst()==6 || numbers.getLast()==6){
                Flag = true;
                System.out.println(Flag);
            }
            else{
                Flag = false;
                System.out.println(Flag);
            }}
        System.out.print("Array elements: [ ");
        for (int num : numbers) {
            System.out.print(num+ "," + " ");
        }
        System.out.println("]");
    }}