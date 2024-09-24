import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter a phrase: ");
        String phrase = scan.nextLine();
        phrase = phrase.replace(" ", "");   //joint
        System.out.print("enter a sub-phrase to find from original phrase: ");
        String subStringToFind = scan.nextLine();
        subStringToFind = subStringToFind.replace(" ", "");
        countOccurrences(phrase, subStringToFind);
    }

    public static int countOccurrences(String str, String substr) {

        int occurrenceOfSubstring = 0; //setting the count
        // str=abab
        //sub=ab
        int endingIndex = substr.length();
        for (int i = 0; i <= str.length() - substr.length(); i++) {    //loop starts from zero
            String matchingCharacters = str.substring(i, endingIndex++); //built-in method in Java, provided by the String class.
            if (substr.equals(matchingCharacters)) {
                occurrenceOfSubstring++;
            }
        }
        System.out.println("occurrence= " + occurrenceOfSubstring);
        return occurrenceOfSubstring;
    }}
