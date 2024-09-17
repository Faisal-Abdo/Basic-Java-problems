import java.util.Scanner;

public class thirdQ {
    public static void main(String[] args){
        int i = 0;
        while (i < 1000) {
            Scanner positive = new Scanner(System.in);
            int posnumber  = positive.nextInt();
            System.out.println("Enter positive number");
            if (posnumber > 0){
                continue;
            }
            else{
                break;
            }

        }
    }
}
