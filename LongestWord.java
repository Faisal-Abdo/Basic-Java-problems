public class LongestWord {
    public static void main(String[] args) {
        longestWord("Feed me berry and raspberries");
    }
    public static String longestWord(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        String longest = "";
        for(int k=0; k<sentenceArray.length;k++){
            for(int i=0; i<sentenceArray.length; i++){
                if((sentenceArray[k].length())>(sentenceArray[i].length())){
                    longest = sentenceArray[k];
                }
                else {
                    continue;
                }
            } }
        System.out.println(longest);
        return longest;
    }
}
