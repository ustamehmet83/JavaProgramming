package day19_NestedLoopRecap;

public class ChrTwiceAppear {
    public static void main(String[] args) {

        String str = "abcddeeffggghh";
        String word = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if (word.contains(""+ch)) {
                continue;
            }
            if (count == 2) {
                word += ch;
            }
        }

        System.out.println(word);
    }


}

