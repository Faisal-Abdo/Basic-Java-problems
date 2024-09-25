import java.util.Scanner;

public class CopiesofChar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String Str = obj.nextLine();
        extraFront(Str);
    }
    public static String extraFront(String str){
        String actualCopies = "";
        if (str.length()>0  && str.length()<2){
            for(int i=0;i<3;i++){
                String copiesofChar1 = str.substring(0, 1);
                actualCopies += copiesofChar1;
            }
        }
        else if (str.length()>1){
            for(int i=0;i<3;i++){
                String copiesofChar2 = str.substring(0, 2);
                actualCopies+= copiesofChar2;
            }}
        System.out.println(actualCopies);
        return actualCopies;
    }}