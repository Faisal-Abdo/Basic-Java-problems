import java.util.Scanner;

public class BlockofConsecutive {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = obj.nextLine();
        findingLength(userInput);
    }
    public static int findingLength(String input){
        char[] charArray = input.toCharArray();
        int maxLength = 0;
        for(int i=0;i<charArray.length;i++){
            int length = 1;
            for(int k=i+1;k<charArray.length;k++){
                if(charArray[i]==charArray[k]){
                    length++;
                } else if (charArray[i]!=charArray[k]) {
                    break;
                }
            }
            if(length>maxLength){
                maxLength=length;
            }
        }
        System.out.println(maxLength);
        return maxLength;
    }
}