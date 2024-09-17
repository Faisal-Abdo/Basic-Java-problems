import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class sixth {
    public static void main(String[] args) {
        /* Q1: int count= 0;
        for(int i = 1; i <= 50; i++) {
            if(i%2==0){
                count+=i;
            }

        }
        System.out.println("the sum of even numbers 1-50 : "+ count); */

        /* Q2: Scanner myObj = new Scanner(System.in);
        int input  = myObj.nextInt();
        for(int i = 1; i <= 12; i++){
            System.out.println(input*i);
        } */

        Scanner myObj = new Scanner(System.in);
        int input  = myObj.nextInt();
        int i = 0;
        int result = 0;
        int input1 = 0;
        int count = 0;
        while (i>=0) {
            count = input;
            result = count*(count-1);
            count--;

            if(count==0){
                break;
            }

        }
        System.out.println(result);
      /*  ArrayList<Character> charofa = new ArrayList<>();
        int a,e,o,u,i;
        String word = "Oman is a land of heritage";
        for (char c : word.toCharArray()) {
            switch (c) {
                case 'a':
                    if (c=='a'){
                        charofa.add(c);
                    }

                    Arrays.stream(c).count();
                    System.out.println("Monday");
                    break;
                case 'e':
                    System.out.println("Tuesday");
                    break;
                case 'u':
                    System.out.println("Wednesday");
                    break;
                case 'i':
                    System.out.println("Thursday");
                    break;
                case 'o':
                    System.out.println("Friday");
                    break;
            }
        } */
    }}
