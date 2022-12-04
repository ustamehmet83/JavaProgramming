package day18_NestedLoops;

public class FrequencyOfCh {
    public static void main(String[] args) {

        String str = "aabcccddaa";


        String word = "";

        for (int j = 0; j < str.length(); j++) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if (word.contains("" + str.charAt(j))) {
                continue;
            }

            word += str.charAt(j);
            word += count;
        }
        System.out.println(word);


/*
String ch=str.substring(i,i+1);
            while(str.charAt(i) == str.charAt(i+1)){

                count++;
                i++;
            }



            word+=count;
 */


    }
}
