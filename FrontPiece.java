import java.sql.SQLOutput;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your preferred size of array: ");
        int size = obj.nextInt();
        System.out.println("Enter " + size + " integers: ");
        int[] Array = new int[size];
        for (int i = 0; i < size; i++) {
            if (obj.hasNextInt()) {
                Array[i] = obj.nextInt();
            }}
        FrontPiec(Array);
      /*  System.out.println("The elements of the array are: ");
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            // prints the elements of an array
            System.out.print(Array[i] + ", ");
        }
        System.out.println("]");*/
    }
    public static int[] FrontPiec(int[] array){
        if(array.length>1){
            System.out.println("["+array[0]+ ", " +array[1]+"]");
        } else if (array.length==1) {
            System.out.println("["+array[0]+"]");
        }
        else{
            System.out.println("Invalid input");
        }
        return array;
    }

}
