package day19_NestedLoopRecap;

public class ReverseSentences {
    public static void main(String[] args) {

        String sentence = "mahmut love java java";
        String sentenceReverse = "";
        String word2 = "";
        sentence = sentence.trim();
        for (int i = sentence.length() - 1; i >= 0; i--) {

            if (("" + sentence.charAt(i)).equals(" ")) {
                sentenceReverse += sentence.substring(i);
                word2 += sentence.substring(i);
                sentence = sentence.replaceFirst(word2, "");
                word2 = "";
            }
        }
        sentenceReverse += " " + sentence;
        System.out.println(sentenceReverse.trim());


    }
}
