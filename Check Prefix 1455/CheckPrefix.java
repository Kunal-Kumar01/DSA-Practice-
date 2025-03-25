
public class CheckPrefix {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        ///class Solution {
        // public int isPrefixOfWord(String sentence, String searchWord) {
        // String[] words = sentence.split(" ");
        // for (int i = 0; i < words.length; i++) {
        // if (words[i].startsWith(searchWord)) {
        // return i + 1;
        // }
        // }
        // return -1;
        // }
        // }
        String[] words = sentence.split(" ");
        int len = searchWord.length();
        int i = 0;
        for (String word : words) {
            if (word.length() >= len) {
                if ((searchWord.equals(word.substring(0, len))) == true) {
                    return i + 1;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }
}
