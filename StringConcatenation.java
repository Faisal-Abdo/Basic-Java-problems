import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String Str1 = obj.nextLine();
        System.out.print("Enter 2nd string: ");
        String Str2 = obj.nextLine();
        minCat(Str1,Str2);
    }
    public static String minCat(String str1, String str2){
        String ConcatStrings = "";
        if(str1.length()!=str2.length()){
            if (str1.length()>str2.length()){
                int DiffofStrings1 = str1.length() - str2.length();
                ConcatStrings = str1.substring(DiffofStrings1);
                ConcatStrings+=str2;
                }
            else if(str1.length()<str2.length()){
                int DiffofStrings2 = str2.length() - str1.length();
                ConcatStrings = str2.substring(DiffofStrings2);
                str1+=ConcatStrings;
                ConcatStrings = str1;
        }
        }
        else if(str1.length()==str2.length()){
            ConcatStrings = str1+str2;
        }
        System.out.println(ConcatStrings);
        return ConcatStrings;
    }}

