import java.util.Scanner;

public class FirstRepeatedChar {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter any string: ");
            String input = obj.nextLine();
            char[] CharofString = input.toCharArray();
            char Redundant = ' '; //to store first repeated character
            int nullcount=0;
            for(char a: CharofString){
                int count = 0;  //count is initialized here so that for every character check , it resets to 0
                for(char b:CharofString){
                    if(a==b){
                        count++;
                    }}
                if(count>1){
                    Redundant = a;
                    break;
                }
                else  {
                    nullcount++;
                }
            }
            if (nullcount>=CharofString.length){  //This will print null in case of no redundant character
                System.out.println("null");
            }
            else {
                System.out.println("The first repeated character is " + Redundant);
            }
    }}
