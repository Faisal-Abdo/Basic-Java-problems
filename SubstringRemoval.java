import java.util.Scanner;

public class SubstringRemoval {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a string: ");
        String input1 = obj.nextLine();
        System.out.print("enter a substring you want to remove: ");
        String input2 = obj.nextLine();
        String newString = input1.replaceAll(input2,"");
        System.out.println(newString);
    }
}
