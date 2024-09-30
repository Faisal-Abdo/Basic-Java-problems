import java.util.Scanner;

public class SummingDigitsofString {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string that is alphanumeric: ");
        String userInput = obj.nextLine();
        summingDigits(userInput);
    }
    public static void summingDigits(String input){
        char[] charArray = input.toCharArray();
        int sum = 0;
        for(char a: charArray){
            if(Character.isDigit(a)) {
                String chartoString = Character.toString(a);
                int stringtoInt = Integer.parseInt(chartoString);
                sum+=stringtoInt;
            }}
        System.out.println("The sum of digits within the string: "+ sum);
        }
    }