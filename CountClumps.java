import java.util.Scanner;

public class CountClumps {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your preferred size of array: ");
        int size1 = obj.nextInt();
        System.out.println("Enter " + size1 + " integers: ");
        int[] Array = new int[size1];
        for (int i = 0; i < size1; i++
        ) {
            if (obj.hasNextInt()) {
                Array[i] = obj.nextInt();
            }
        }
        countClumps(Array);
    }

    public static int[] countClumps(int[] array) {
        int clumpsCount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean state = false;  //everytime we exit a clump , flag is set to false
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] == array[k]) {
                    if (state == false) { //this is to avoid counting duplicate elements within a clump
                        state = true;
                        clumpsCount++;
                    }
                } else if (array[i] != array[k]) {
                    i = k - 1; //outer loop will start from the point outside the clump
                    break;
                }
            }
        }
        System.out.println(clumpsCount);
        return null;
    }
}
