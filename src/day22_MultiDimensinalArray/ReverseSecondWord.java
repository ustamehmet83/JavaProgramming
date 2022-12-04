package day22_MultiDimensinalArray;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String[] words = sentence.split(" ");
        String newWord = "";
        for (int i = 0; i < words.length; i++) {
            if (i == 1) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    newWord += words[i].charAt(j);
                }
                newWord += " ";
                continue;
            }
            newWord += words[i] + " ";
        }
        System.out.println(newWord);
    }
}
