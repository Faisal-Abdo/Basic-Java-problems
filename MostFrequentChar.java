import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        char[] CharofString = input.toCharArray();
        int maxcount = 0;
        char Redundant = ' ';
        for(char a: CharofString){
            int count = 0;
            for(char b:CharofString){
                if(a==b){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                Redundant = a;
            }
        }
        System.out.println("The most frequent character is " + Redundant);
    }
}
