import java.util.Scanner;

public class Front11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your preferred size of 1st array: ");
        int size1 = obj.nextInt();
        System.out.println("Enter " + size1 + " integers: ");
        int[] Array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            if (obj.hasNextInt()) {
                Array1[i] = obj.nextInt();
            }
        }
        System.out.println("Enter your preferred size of 2nd array: ");
        int size2 = obj.nextInt();
        System.out.println("Enter " + size2 + " integers: ");
        int[] Array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            if (obj.hasNextInt()) {
                Array2[i] = obj.nextInt();
            }
        }
        findingFront(Array1,Array2);
    }
        public static int[] findingFront(int[] array, int[] array1){
            if(array.length>0 && array1.length>0){
                System.out.println("["+array[0]+","+array1[0]+"]");
            } else if (array.length>0 && array1.length<1) {
                System.out.println("["+array[0]+"]");
            } else if (array.length<1 && array1.length>0) {
                System.out.println("["+array1[0]+"]");
            }
            return null;
    }
}
