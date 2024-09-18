import java.util.Scanner;
import java.util.ArrayList;

public class fifth {
    public static void main(String[] args) {
        //calculates the sum of all positive integers question
        ArrayList<Integer> positive = new ArrayList<>();
        int j = 0;
        System.out.println("Enter positive numbers: ");
        do {

            Scanner scanner = new Scanner(System.in); //will ask user input
            int input  = scanner.nextInt();
            if(input>0) {
                positive.add(input);
                continue;
            }
            else if (input==0){
                break;  //if user input zero loops stops
            }
            else {
                break;
            }
        } while (true);

        int sum = 0;

        for (int i : positive){
            sum += i;
        }

        System.out.println("sum of array = " + sum);
    }
}
