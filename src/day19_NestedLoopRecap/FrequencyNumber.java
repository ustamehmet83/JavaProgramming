package day19_NestedLoopRecap;

public class FrequencyNumber {
    public static void main(String[] args) {

        String str = " aabbbb";
        int count = 0;
        String word =" ";
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {
                if ((""+(str.charAt(i))).equals(""+str.charAt(j))) {
                    count++;
                }

            }

            if (!word.contains("" + str.charAt(i))) {
                word += ""+str.charAt(i);
                word += count;
            }
            count = 0;
        }
        System.out.println(word);
    }
}
