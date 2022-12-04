package day19_NestedLoopRecap;

public class HighestFrequency {
    public static void main(String[] args) {
        String str = "aaabbbccccdddddeeeeeffffff";
        int count = 0;
        int maximum = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            count = 0;


            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maximum) {
                word = "" + str.charAt(i);
            }


            if (!word.contains("" + str.charAt(i)) && (count == maximum)) {
                word += "" + str.charAt(i);
            }
            maximum = count;
            count = 0;
        }
        System.out.println(word);

    }
}
