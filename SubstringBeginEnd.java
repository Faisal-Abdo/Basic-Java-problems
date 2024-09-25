import java.util.Scanner;

public class SubstringBeginEnd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String Str = obj.nextLine();
        without2(Str);
    }
    public static String without2(String str){
        String begin = str.substring(0, 2);
        String end = str.substring(str.length()-2, str.length());
        String newString = "";
        if (begin.equals(end)){
            newString = str.substring(2,str.length()); //removing the first two characters
        } else if (str.length()<3) {
            System.out.println("");  // ex: Hi  , which index = 2
        }
        else{
            newString = str;  //if it is a String with no begin and end repetition
        }
        System.out.println(newString);
        return newString;
    }}