import java.util.Scanner;

public class FourthQ {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int rows  = myObj.nextInt();
        int count = 0;
        for(int i = 0; i <= rows; i++){
            count++;
            for(int x = 0; x <= i; x++) {
                System.out.println("*");

            }

        }
    }
    }

